public class Elective{
    public String AcademicSubject;
    public Learner[] Learners= new Learner[30];
    public Teacher ClassTeacher;
    public Parent[] getListParrents(){
        Learner par = new Learner();
        return par.Parrents;
    }
    public Learner[] getList(){
        return Learners;
    }
}
