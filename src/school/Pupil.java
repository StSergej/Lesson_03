package school;

public class Pupil extends ClassRoom {

    void study() {
        System.out.print("Study: ");
    }
    void read() {
        System.out.print("Read: ");
    }
    void write() {
        System.out.print("Write: ");
    }
    void relax() {
        System.out.print("Relax: ");
    }
}

class ExcellentPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("excellent");
    }
    @Override
    void read() {
        super.read();
        System.out.print("excellent");
    }
    @Override
    void write() {
        super.write();
        System.out.print("excellent");
    }
    @Override
    void relax() {
        super.relax();
        System.out.println("excellent");
    }
}
class GoodPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("good");
    }
    @Override
    void read() {
        super.read();
        System.out.print("good");
    }
    @Override
    void write() {
        super.write();
        System.out.print("good");
    }
    @Override
    void relax() {
        super.relax();
        System.out.println("good");
    }
}
class BadPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.print("bad");
    }
    @Override
    void read() {
        super.read();
        System.out.print("bad");
    }
    @Override
    void write() {
        super.write();
        System.out.print("bad");
    }
    @Override
    void relax() {
        super.relax();
        System.out.println("bad");
    }
}
