package gr.aueb.cl.ch20.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Teacher> teachers = Arrays.asList(new Teacher(1, "Alice", "W")
    ,new Teacher(2, "Bob", "M."), new Teacher(3, "Costas", "P."),
            new Teacher(4, "Donald", "T."));

    public static void main(String[] args) {
//        List<Teacher> filteredTeachers = getFilteredTeachers(teachers, new ITeacherIDFilter() {
//            @Override
//            public boolean filterID(Teacher teacher) {
//                return teacher.getId() == 3;
//            }
//        });

        //Υλοποίηση της accept
//        List<Teacher> filteredTeachers = getFilteredTeachers(teachers, teacher -> teacher.getId() == 3);
//        printTeachers(filteredTeachers, teacher -> teacher.printFullName());
//        printTeachers(filteredTeachers, teacher -> Teacher.printTeacher(teacher));
//        printTeachers(filteredTeachers, teacher -> System.out.println(teacher));
//
//        printTeachers(filteredTeachers, Teacher::printFullName);
//        printTeachers(filteredTeachers, Teacher::printFullName);
//        printTeachers(filteredTeachers, System.out::println);

        checkAndPrintTeachers(teachers, teacher -> teacher.getFirstname().length() >= 4, System.out::println);

//        for (Teacher teacher : filteredTeachers) {
//            teacher.printFullName();
//        }

    }

    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter) {//ITeacherIDFilter filter) {
        List<Teacher> teachersToReturn = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teachersToReturn.add(teacher);
            }
        }
        return teachersToReturn;
    }

    //υλοποίηση με interface consumer
    public static void printTeachers(List<Teacher> teachers, Consumer<Teacher> consumer) {
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }

    public static void checkAndPrintTeachers(List<Teacher>teachers, Predicate<Teacher> filter, Consumer<Teacher> consumer) {
        teachers.forEach(teacher -> {
            if (filter.test(teacher)) {
                consumer.accept(teacher);
            }
        } );
    }
}
