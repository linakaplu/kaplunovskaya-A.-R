/* Вариант 12). Учет выполненных работ станции техобслуживания. Создать ро-
        дительский класс «ТехОбслуживание» (название станции, адрес станции, название
        автотранспорта на ремонте, вид ремонта, дата поступления, дата выдачи, результат
        ремонта, фамилия персонала, сумма ремонта) и дочерние классы:

        - «планово-предупредительный осмотр для легкового транспорта» (вид
        (плановый/капитальный), год проведения, пробег, период);

        — «неисправности» (название неисправности, описание выполненных ра-
        бот);

        - «планово-предупредительный осмотр для грузового транспорта» (вид
        (ТО-1, ТО -2, ТО-3), год проведения, пробег, период, объем двигателя).

        Реализовать класс для хранения списка выполненных работ с методом добав-
        ления ремонта и методом печати списка ремонтов. */



public class Practica4 {
        public static void main (String[]args) {
            CarLists carLists = new CarLists();
            carLists.Add(new InspecOfPassengersCars("МЕХАник", "ул. Кренделькова, 36А", "Mazda X5", "ремонт двигателя, замена масла, заправка кондиционера", "06.07.2020", "24.07.2020", "успешно", "Колесников", 4620, "Плановая", 2020, 345670, "06.2020-07.2020"));
            carLists.Add(new Malfunction("МЕХАник", "ул. Кренделькова, 36А", "Lada Largus", "ремонт двигателя и колес", "18.04.2020", "26.04.2020", "успешно", "Девочкин", 9500, "Поломка двигателя, прокол колеса", "Выполнена чистка двигателя, проведен осмотр всех колес и замена и накачка правого колеса"));
            carLists.Add(new InspecOfCargoCars("МЕХАник", "ул. Кренделькова, 36А", "ВАЗ", "замена масла, заправка кондиционера", "23.11.2020", "08.12.2020", "успешно", "Колесников", 4620, "П-2", 2020, 563280, " - 06.2020-07.2020", "25 кв. см."));

            System.out.println(carLists);
        }
    }

