package job4j.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("Reboot serv", 7),
                new Job("delete", 5)

        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        System.out.println();
        // комбинируем любую сортировку через - thenComparing
        // комбинировать компораторы можно до бесконечностм
        Collections.sort(jobs, new SortByNameJob().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        System.out.println();
        Comparator<Job> comb = new JobDescByNameLn().thenComparing(new SortByNameJob()
                .thenComparing(new JobDescByPriority()));
        Collections.sort(jobs, comb);

    }
}
