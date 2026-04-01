package Lession10_1;

import java.util.ArrayList;

public class StudenManager {
    // array list
    private ArrayList<Strudent> strudents;
    public StudenManager(){
        strudents = new ArrayList<>();
    }
    public void addStudent(Strudent strudent){
        strudents.add(strudent);
    }
    public void hienHS(){
        if (strudents.isEmpty()){
            System.out.println("Danh sách trống.");
        } else {
            for (Strudent strudent:strudents){
                System.out.println(strudent);
            }
        }
    }
}