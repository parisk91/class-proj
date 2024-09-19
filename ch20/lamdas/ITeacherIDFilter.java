package gr.aueb.cl.ch20.lamdas;

@FunctionalInterface
public interface ITeacherIDFilter {
    boolean filterID(Teacher teacher);
}
