public class School {
    public Employee[] Employes = new Employee[30];
    public Teacher[] Teachers = new Teacher[30];
    public Learner[] Learners = new Learner[30];
    public String Adress;
    public String Name;
    public Class[] Classes = new Class[30];
    public Elective[] Electives = new Elective [30];
    public Selection[] Selections = new Selection[30];
    public Teacher[] getListTeachers(){
        return Teachers;
    }
    public Employee[] getListEmployeers(){
        return Employes;
    }
    public Learner[] getListLearners(){
        return Learners;
    }
    public Person[] getElectronicJournal(){
        return new Person[30];
    }
    public Participant getParticipant (){
        return new Participant();
    }
}
