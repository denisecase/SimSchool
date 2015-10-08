package simschool.inhabitantStates;

import simschool.inhabitants.Professor;
import simschool.stateInterfaces.IProfessorState;

public class ProfessorGradeHomeworkState implements IProfessorState {

    @Override
    public void OnEnter(Professor inhabitant) {
        inhabitant.Display("{{Getting started grading.}}");
    }

    @Override
    public void Execute(Professor inhabitant) {
        inhabitant.Display("{{work work}} Grading papers.");
        inhabitant.ChangeState(new ProfessorSleepState());
    }

    @Override
    public void OnExit(Professor inhabitant) {
        inhabitant.Display("{{Smile}} Awesome students.");
    }

}
