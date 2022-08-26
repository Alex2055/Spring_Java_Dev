public class Mentor {
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    public Mentor(FullTimeMentor fulltimeMentor, PartTimeMentor partTimeMentor){
        this.fullTimeMentor = fulltimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }
}

