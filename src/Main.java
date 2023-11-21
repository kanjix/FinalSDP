import Adapter.*;

import Decorator.*;

import Factory.*;

import Singleton.*;

import Strategy.*;

import Observer.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            System.out.println("Добро пожаловать в SneakerShop! \n Мы только открылись, но уверяеем мы достигнем высот и каждый третий будет носить обувь с нашего магазинв!");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Выберите ваш статус - Если вы: \n 1 - Студент \n 2 - Абитуриент \n 3 - Обычный покупатель \n");
            int userType = scanner.nextInt();

            PricingStrategy pricingStrategy;

            switch (userType) {
                case 1:
                    pricingStrategy = new StudentPricingStrategy();
                    break;
                case 2:
                    pricingStrategy = new SchoolPricingStrategy();
                    break;
                case 3:
                    pricingStrategy = new RegularPricingStrategy();
                    break;
                default:
                    System.out.println("Неверный выбор, возможно произошла ошибка, будем считать что вы обычный пользователь.");
                    pricingStrategy = new RegularPricingStrategy();
            }

            SneakerFactory adidasFactory = new AdidasFactory();
            List<SneakerF> suggestedSneakers = Arrays.asList(
                    adidasFactory.createSneaker(1),
                    adidasFactory.createSneaker(2)
                    // Добавьте другие бренды и модели при необходимости
            );

            SneakerShop sneakerShop = new SneakerShop();
            sneakerShop.setPricingStrategy(pricingStrategy);

            // Вывести цены со скидкой только в начале
            System.out.println("ВАЖНО: Скидки только при покупке в офлайн магазине! \n Рекомендуемые кроссовки (цены со скидкой):");
            for (SneakerF sneaker : suggestedSneakers) {
                double discountedPrice = pricingStrategy.calculatePrice(sneaker.getPrice());
                System.out.println(sneaker.getModel() + " - Цена: $" + discountedPrice);
            }


    // Метод для создания объекта стратегии в зависимости от выбора пола





            // Определение размера обуви
            System.out.println("Выберите формат размера обуви: \n 1 - В сантиметрах \n 2 - В US формате ");
            int sizeFormatChoice = scanner.nextInt();

            double footSize;
            if (sizeFormatChoice == 1) {
                System.out.println("Введите размер своей ноги в сантиметрах: ");
                footSize = scanner.nextDouble();
            } else {
                System.out.println("Введите размер своей ноги в US формате: ");
                footSize = scanner.nextDouble();
            }

            // Конвертация размера обуви
            SizeAdapter sizeAdapter;
            if (sizeFormatChoice == 1) {
                sizeAdapter = new SizeAdapterCmToUs();
            } else {
                sizeAdapter = new SizeAdapterUsToUkEu();
            }

            int sizeInUs = sizeAdapter.convertSize((int) footSize, "CM", "US");
            int sizeInUk = sizeAdapter.convertSize(sizeInUs, "US", "UK");
            int sizeInEu = sizeAdapter.convertSize(sizeInUs, "US", "EU");

            System.out.println("Ваши размеры обуви:");
            System.out.println("US размер: " + sizeInUs);
            System.out.println("UK размер: " + sizeInUk);
            System.out.println("EU размер: " + sizeInEu);

            // Выбор бренда
            System.out.println("Выберите бренд: \n 1 - Adidas \n 2 - Nike \n 3 - New Balance \n ");
            int brandChoice = scanner.nextInt();

// Создание кроссовок
            SneakerFactory sneakerFactory;
            switch (brandChoice) {
                case 1:
                    sneakerFactory = new AdidasFactory();
                    break;
                case 2:
                    sneakerFactory = new NikeFactory();
                    break;
                case 3:
                    sneakerFactory = new NewBalanceFactory();
                    break;
                default:
                    System.out.println("Неверный выбор бренда, такого пока не существует.");
                    return;
            }

// Выводим доступные модели для выбранного бренда
            System.out.println("Доступные модели:");

            if (sneakerFactory instanceof AdidasFactory) {
                System.out.println("1. Adidas Superstar");
                System.out.println("2. Adidas Aloha Shoes");
            } else if (sneakerFactory instanceof NikeFactory) {
                System.out.println("1. Nike AF1");
                System.out.println("2. Nike DunkLow");
            } else if (sneakerFactory instanceof NewBalanceFactory) {
                System.out.println("1. New Balance Fresh Foam");
                System.out.println("2. New Balance FuelCell");
            }

// Выбор модели
            System.out.println("Выберите номер модели кроссовок: ");
            int modelChoice = scanner.nextInt();

            SneakerF sneaker = sneakerFactory.createSneaker(modelChoice);

// Вывод информации о кроссовках
            System.out.println("Ваши кроссовки: " + sneaker.getModel());
            System.out.println("Цена: $" + sneaker.getPrice());






            // Уведомление о наличии товара
            SneakerInventoryManager inventoryManager = SneakerInventoryManager.getInstance();

            // Добавляем кроссовки в инвентарь
            inventoryManager.addSneakers(50);

            // Выводим информацию о наличии кроссовок
            System.out.println("Текущее количество кроссовок на складе: " + inventoryManager.getSneakerCount());

            // Покупатель хочет купить 20 кроссовок
            int quantityToBuy = 20;

            // Проверяем, есть ли достаточное количество кроссовок для покупки
            if (inventoryManager.isQuantityAvailable(quantityToBuy)) {
                // Производим продажу
                inventoryManager.removeSneakers(quantityToBuy);
                System.out.println("Продажа выполнена. Оставшееся количество кроссовок: " + inventoryManager.getSneakerCount());
            } else {
                System.out.println("Извините, товара нет в достаточном количестве для покупки.");
            }

            // Дополнительные услуги
            System.out.println("Желаете добавить дополнительные услуги? \n 1 - Да \n 2 - Нет \n ");
            int additionalServicesChoice = scanner.nextInt();

// Логика обработки дополнительных услуг
            Sneaker basicSneaker = new Sneaker("Базовая модель кроссовок", sneaker.getPrice());

// Выводим информацию о базовой модели
            System.out.println("Основная модель: " + basicSneaker.getDescription());
            System.out.println("Цена: $" + basicSneaker.getPrice());

// Добавляем фирменную упаковку, если пользователь выбрал эту услугу
            if (additionalServicesChoice == 1) {
                System.out.println("Добавить фирменную упаковку? \n 1 - Да \n 2 - Нет \n ");
                int brandedPackagingChoice = scanner.nextInt();
                if (brandedPackagingChoice == 1) {
                    basicSneaker = new SneakerInBrandedPackaging(basicSneaker.getDescription() + " в фирменной упаковке", basicSneaker.getPrice() + 15.0);
                    System.out.println("Фирменная упаковка добавлена!");
                }
            }

// Добавляем подарочную карту, если пользователь выбрал эту услугу
            if (additionalServicesChoice == 1) {
                System.out.println("Добавить подарочную карту? \n 1 - Да \n 2 - Нет \n ");
                int giftCardChoice = scanner.nextInt();
                if (giftCardChoice == 1) {
                    basicSneaker = new GiftCardDecorator(basicSneaker, basicSneaker.getDescription() + ", с подарочной картой", basicSneaker.getPrice() + 10.0);
                    System.out.println("Подарочная карта добавлена!");
                }
            }

// Выводим информацию о конечной модели
            System.out.println("Конечная модель: " + basicSneaker.getDescription());
            System.out.println("Цена: $" + basicSneaker.getPrice());

        }
    }
