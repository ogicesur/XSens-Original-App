package com.xsens.dot.android.example;

import androidx.appcompat.app.AppCompatActivity;

public class Spinners_Management extends AppCompatActivity {
    /*
        public void onCreate() {
            MainActivity mainActivity = new MainActivity();
            mainActivity.setContentView(R.layout.activity_main);


            Spinner participants = (Spinner) findViewById(R.id.part_id);
            String[] participants_id = getResources().getStringArray(R.array.participants);
            ArrayAdapter itemsAdapter = new ArrayAdapter(this, R.layout.dropdown_item, participants_id);
            participants.setAdapter(itemsAdapter);

            participants.setOnItemSelectedListener(new OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                    Toast.makeText(getApplicationContext(), "Selected Participant ID: " + participants_id[position], Toast.LENGTH_SHORT).show();
                    int spinnerets = Integer.parseInt((String) participants.getSelectedItem());
                    combination_spinner(spinnerets);
                }

                @Override
                public void onNothingSelected(AdapterView<?> arg0) {
                }
            });
        }


        public void combination_spinner(int combination_number) {
            Spinner combinations = (Spinner) findViewById(R.id.combinations);
            String[] combination_id = getResources().getStringArray(switch_for_combinations_strings(combination_number));

            ArrayAdapter itemsAdapter1 = new ArrayAdapter(this, R.layout.dropdown_item, combination_id);
            combinations.setAdapter(itemsAdapter1);

            combinations.setOnItemSelectedListener (new OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                    Toast.makeText(getApplicationContext(), "Selected Combination ID: " + combination_id[position], Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });

        }
    */
    public int switch_for_combinations_strings(int combination) {
        switch (combination) {
            case 1:
                return R.array.Participant_1;

            case 2:
                return R.array.Participant_2;

            case 3:
                return R.array.Participant_3;

            case 4:
                return R.array.Participant_4;

            case 5:
                return R.array.Participant_5;

            case 6:
                return R.array.Participant_6;

            case 7:
                return R.array.Participant_7;

            case 8:
                return R.array.Participant_8;

            case 9:
                return R.array.Participant_9;

            case 10:
                return R.array.Participant_10;

            case 11:
                return R.array.Participant_11;

            case 12:
                return R.array.Participant_12;

            case 13:
                return R.array.Participant_13;

            case 14:
                return R.array.Participant_14;

            case 15:
                return R.array.Participant_15;

            case 16:
                return R.array.Participant_16;

            case 17:
                return R.array.Participant_17;

            case 18:
                return R.array.Participant_18;
        }
        return R.array.Participant_1;
    }

    public int switch_for_tasks_strings(int combination) {
        switch (combination) {
            case 1:
                return R.array.Task_Combination_1;

            case 2:
                return R.array.Task_Combination_2;

            case 3:
                return R.array.Task_Combination_3;

            case 4:
                return R.array.Task_Combination_4;

            case 5:
                return R.array.Task_Combination_5;

            case 6:
                return R.array.Task_Combination_6;

            case 7:
                return R.array.Task_Combination_7;

            case 8:
                return R.array.Task_Combination_8;

            case 9:
                return R.array.Task_Combination_9;

            case 10:
                return R.array.Task_Combination_10;
        }
        return R.array.Task_Combination_10;
    }

    /*public int letter_to_string( String letter) {
        switch (letter){
            case "A":
                return 1;

            case "B":
                return 2;

            case "C":
                return 3;

            case "D":
                return 4;

            case "E":
                return 5;

            case "F":
                return 6;

            case "G":
                return 7;

            case "H":
                return 8;

            case "I":
                return 9;
        }
        return 1;
    }
*/
    public int participant_starting_tasks_combination(int participant_id) {
        switch (participant_id) {
            case 1:
            case 12:
                return 1;

            case 2:
            case 11:
                return 10;

            case 3:
                return 9;

            case 4:
                return 8;

            case 5:
            case 18:
                return 7;

            case 6:
            case 17:
                return 6;

            case 7:
            case 16:
                return 5;

            case 8:
            case 15:
                return 4;

            case 9:
            case 14:
                return 3;

            case 10:
            case 13:
                return 2;
        }
        return 1;
    }

    public int tasks_sorting(int participant_id, int position) {
        if (participant_id <= 10) {
            int tasks_id = Math.abs(participant_starting_tasks_combination(participant_id) + position) % 10;
            return tasks_id;
        } else {
            int tasks_id = Math.abs(participant_starting_tasks_combination(participant_id) - position) % 10;
            return tasks_id;
        }
    }
/*
    public void participant_spinner(Spinner participants, Spinner combinations, Spinner tasks, int[] item_on_the_combination_spinner, int[] item_on_the_tasks_spinner, String[] x){
        final int[] position_of_participants = {0};
        //String[] participants_id = getResources().getStringArray(R.array.participants);
        ArrayAdapter itemsAdapter = new ArrayAdapter(this, R.layout.dropdown_item, x);
        participants.setAdapter(itemsAdapter);

        participants.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                //Toast.makeText(getApplicationContext(), "Selected Participant ID: " + participants_id[position], Toast.LENGTH_SHORT).show();
                position_of_participants[0] = position + 1;
                int spinnerets = Integer.parseInt((String) participants.getSelectedItem());
                combination_spinner(position_of_participants[0], spinnerets, combinations, tasks, item_on_the_combination_spinner, item_on_the_tasks_spinner);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void combination_spinner(int position_of_participant,int combination_number, Spinner combinations, Spinner tasks, int[] item_on_the_combination_spinner, int[] item_on_the_tasks_spinner) {
        Spinners_Management spinners_management = new Spinners_Management();
        String[] combination_id = getResources().getStringArray(spinners_management.switch_for_combinations_strings(combination_number));
        ArrayAdapter itemsAdapter_combination = new ArrayAdapter(this, R.layout.dropdown_item, combination_id);
        combinations.setAdapter(itemsAdapter_combination);
        combinations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                item_on_the_combination_spinner[0] = position;
                //Toast.makeText(getApplicationContext(), "Selected Combination ID: " + position, Toast.LENGTH_SHORT).show();
                task_combination_spinner(position_of_participant, item_on_the_combination_spinner,combinations, tasks, item_on_the_tasks_spinner);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void task_combination_spinner(int participant_id, int[] item_on_the_combination_spinner,Spinner combinations, Spinner tasks, int[] item_on_the_tasks_spinner){
        Spinners_Management spinners_management = new Spinners_Management();
        int task_id = spinners_management.tasks_sorting(participant_id,item_on_the_combination_spinner[0]);
        String[] tasks_id = getResources().getStringArray(spinners_management.switch_for_tasks_strings(task_id));
        ArrayAdapter itemsAdapter_tasks = new ArrayAdapter(this, R.layout.dropdown_item, tasks_id);
        tasks.setAdapter(itemsAdapter_tasks);

        Button next_button = (Button) findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
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
        });

        Button previous_button = (Button) findViewById(R.id.previous_button);
        previous_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
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
        });


        tasks.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                item_on_the_tasks_spinner[0] = position;
                Toast.makeText(getApplicationContext(), "Selected Combination ID: " + position, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}
*/
}