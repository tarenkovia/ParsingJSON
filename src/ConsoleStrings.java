public class ConsoleStrings {
    private String printer;
    public ConsoleStrings(){
        super();
    }
    public void printUpper(){
        System.out.println("----------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------|" +
                "---------------------------------------------------------------------------------|---------------" +
                "----------------------------------------------|");
        System.out.format("%-2.3s %-20.15s %-15.10s %-15.13s %-33.30s %-20.16s %-20.21s %-33.30s %-19.20s %-17.20s %-31.30s %-20.20s %-23.12s %-30.30s %-4.8s\n",
                "ID", "Фамилия", "Имя", "Отчество", "Дата рождения","Город рождения", "Номер паспорта", "Дата выдачи паспорта", "Код подразделения |", "Номер счета",
                "Дата открытия", "Дата закрытия\t\t\t\t  |", "Номер карты", "Дата закрытия", "CVV  |");
        System.out.println("----------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------|" +
                "---------------------------------------------------------------------------------|---------------" +
                "----------------------------------------------|");
    }

    public void successRead(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println( "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tФайл формата JSON успешно считан!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n");
    }

    public void getGap(){
        System.out.println("\n\n\n\n");
    }

    public void successWrite(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println( "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tДанные успешно созданы и записаны!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n");
    }
}
