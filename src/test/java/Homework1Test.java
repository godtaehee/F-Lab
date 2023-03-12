import homework1.Man;
import homework1.People;
import homework1.Woman;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Homework1Test {

    @Test
    public void onlyMan() {
        // given
        Random random = new Random();

        int manCount = random.nextInt(100);

        List<People> manList = new ArrayList<>();

        for (int i = 0; i < manCount; i++) {
            manList.add(new Man(random.nextInt(160, 190)));
        }

        // when
        manList.sort(Comparator.comparing((a) -> a));

        // then
        assertTrue(confirmAscending(manList));
    }

    @Test
    public void onlyWoman() {
        // given
        Random random = new Random();

        int womanCount = random.nextInt(100);

        Set<Integer> studentIds = new HashSet<>();

        List<People> womanList = new ArrayList<>();

        for (int i = 0; i < womanCount; i++) {
            studentIds.add(random.nextInt(1, womanCount));
        }

        for (int studentId: studentIds) {
            womanList.add(new Woman(studentId));
        }

        // when
        womanList.sort(Comparator.comparing((a) -> a));

        // then
        assertTrue(confirmAscending(womanList));
    }

    @Test
    public void manAndWoman() {
        // given man
        Random random = new Random();

        int manCount = random.nextInt(100);

        List<People> peopleList = new ArrayList<>();

        for (int i = 0; i < manCount; i++) {
            peopleList.add(new Man(random.nextInt(160, 190)));
        }

        // given woman
        int womanCount = random.nextInt(100);

        Set<Integer> studentIds = new HashSet<>();

        for (int i = 0; i < womanCount; i++) {
            studentIds.add(random.nextInt(1, womanCount));
        }

        for (int studentId: studentIds) {
            peopleList.add(new Woman(studentId));
        }


        // when
        peopleList.sort(Comparator.comparing((a) -> a));

        // then
        assertTrue(confirmAscending(peopleList));
    }

    @Test
    public void onlyOneManAndWoman() {

        // given man
        Random random = new Random();


        List<People> peopleList = new ArrayList<>();

        for (int i = 0; i < 1; i++) {
            peopleList.add(new Man(random.nextInt(160, 190)));
        }

        // given woman
        int womanCount = random.nextInt(100);

        Set<Integer> studentIds = new HashSet<>();

        for (int i = 0; i < womanCount; i++) {
            studentIds.add(random.nextInt(1, womanCount));
        }

        for (int studentId: studentIds) {
            peopleList.add(new Woman(studentId));
        }

        // when
        peopleList.sort(Comparator.comparing((a) -> a));

        // then
        assertTrue(confirmAscending(peopleList));
    }

    @Test
    public void onlyOneWomanAndMan() {
        // given man
        Random random = new Random();

        int manCount = random.nextInt(100);

        List<People> peopleList = new ArrayList<>();

        for (int i = 0; i < manCount; i++) {
            peopleList.add(new Man(random.nextInt(160, 190)));
        }

        // given woman

        Set<Integer> studentIds = new HashSet<>();

        for (int i = 0; i < 1; i++) {
            studentIds.add(random.nextInt(1));
        }

        for (int studentId: studentIds) {
            peopleList.add(new Woman(studentId));
        }

        // when
        peopleList.sort(Comparator.comparing((a) -> a));

        System.out.println(peopleList);

        // then
        assertTrue(confirmAscending(peopleList));
    }

    @Test
    public void emptyCase() {
        // given
        List<People> peopleList = new ArrayList<>();

        // when
        peopleList.sort(Comparator.comparing((a) -> a));

        // then
        assertTrue(confirmAscending(peopleList));
    }

    boolean confirmAscending(List<People> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            People firstPeople = arr.get(i);
            People secondPeople = arr.get(i + 1);
            if ( firstPeople instanceof Man && secondPeople instanceof Man) {
                if (((Man) firstPeople).getHeight() > ((Man) secondPeople).getHeight()) {
                    return false;
                }
            } else if (firstPeople instanceof Woman && secondPeople instanceof Woman) {
                if (((Woman) firstPeople).getStudentId() >= ((Woman) secondPeople).getStudentId()) {
                    return false;
                }
            } else if (firstPeople instanceof Woman && secondPeople instanceof  Man) {
                return false;
            }
        }
        return true;
    }
}
