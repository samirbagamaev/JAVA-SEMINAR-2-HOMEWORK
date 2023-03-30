package WORK;

public class program1 {
    public static void main(String[] args) {
        String text = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        text = text.replaceAll("[\\[\\]{\"]", "");

        String[] students = text.split("},");

        for (String note : students) {
            String[] temp = note.split(",");
            String[] name = temp[0].split(":");
            String[] ball = temp[1].split(":");
            String[] lesson = temp[2].split(":");
            lesson[1] = lesson[1].replace("}", "");

            StringBuilder sb = new StringBuilder();
            sb.append("Студент ");
            sb.append(name[1]);
            sb.append(" получил ");
            sb.append(ball[1]);
            sb.append(" по предмету ");
            sb.append(lesson[1]);
            System.out.println(sb.toString());

        }
    }
}