package com.example.roomlivedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class scoreviewmodel extends ViewModel {
   //private Integer score;

   // public Integer getScore() {
      // if (score == null) {
      //     score = 0;
    //    }
       // return score;
  //  }

    private MutableLiveData<Integer> score;

    public MutableLiveData<Integer>getScore(){
        if(score==null){
            score=new MutableLiveData<>();
            score.setValue(0);
       //     score.postValue();
        }
        return score;
    }

    public void addscore() {
        if (score.getValue()!= null){
            score.setValue(score.getValue()+1);
        }
    //    if (score == null) {
    //        score = 0;
   //     }
    //    score += 1;
    }

    public void resetscore() {
        score.setValue(0);
     //   score = 0;
    }
}











