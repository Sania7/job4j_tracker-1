package job4j.oop;


//4. Переопределение [#174890 #117353]
public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Report`s name", "Report`s body");
        System.out.println(text);
    }
}
