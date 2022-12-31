package day45_AbstractionContinue_Interface.shape;

public interface Volume {

    boolean hasVolume=true;

    default double method(){
        return 0;
    }
    double volume();


}
