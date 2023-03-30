package WORK;

public class program1 {
    public static void main(String[] args) {
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        text = text.replaceAll("[\\[\\]{\"]", "");

       String[] pupils = text.split("},");

        for (String note : pupils) {
            String[] temp = note.split(",");
            String[] name = temp[0].split(":");
            String[] val = temp[1].split(":");
            String[] item = temp[2].split(":");
            item[1] = item[1].replace("}", "");

            StringBuilder sb = new StringBuilder();
            sb.append("Студент ");
            sb.append(name[1]);
            sb.append(" получил ");
            sb.append(val[1]);
            sb.append(" по предмету ");
            sb.append(item[1]);
            System.out.println(sb.toString());

        }
    }
}
