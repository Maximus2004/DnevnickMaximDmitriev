public class Class {
    public String Number;
    public Teacher ClassTaecher;
    public Learner[] Learners = new Learner[30];
    public Parent[] getListParrents(){
        Learner par = new Learner();
        return par.Parrents;
    }
    public Learner[] getList(){
        return Learners;
    }
}
