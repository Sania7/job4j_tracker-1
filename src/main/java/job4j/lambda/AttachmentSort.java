package job4j.lambda;

import javax.naming.directory.Attributes;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1.1. Анонимные классы [#214142 #117146]
 */
public class AttachmentSort {
    public static void main(String[] args) {

        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator compare = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
}
