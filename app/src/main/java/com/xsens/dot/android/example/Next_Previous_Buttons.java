package com.xsens.dot.android.example;

import android.widget.Spinner;

public class Next_Previous_Buttons {

    public void previous_button_method(int[] item_on_the_tasks_spinner , int[] item_on_the_combination_spinner, Spinner combinations, Spinner tasks){
        if(item_on_the_tasks_spinner[0] < 1 ) {
            if (item_on_the_combination_spinner[0]==0) {

            }
            else {
                combinations.setSelection(--item_on_the_combination_spinner[0]);
                item_on_the_tasks_spinner[0] = 9;
            }
        }
        else tasks.setSelection(--item_on_the_tasks_spinner[0]);
    }

    public void next_button_method(int[] item_on_the_tasks_spinner , int[] item_on_the_combination_spinner, Spinner combinations, Spinner tasks){
        if (item_on_the_tasks_spinner[0] > 8) {
            if(item_on_the_combination_spinner[0]==8){

            }
            else {
                item_on_the_tasks_spinner[0] = 0;
                combinations.setSelection(++item_on_the_combination_spinner[0]);
            }
        }
        else tasks.setSelection(++item_on_the_tasks_spinner[0]);
    }
}
