package simschool.inhabitantStates;

import simschool.inhabitants.Professor;
import simschool.stateInterfaces.IProfessorState;

public class ProfessorDrinkCoffeeState implements IProfessorState {

    @Override
    public void OnEnter(Professor inhabitant) {
        inhabitant.Display("I need a cup of coffee.");
    }

    @Override
    public void Execute(Professor inhabitant) {
        inhabitant.Display("{{sllluuurrrppp}} Umm Umm good.");
        inhabitant.ChangeState(new ProfessorGradeHomeworkState());
    }

    @Override
    public void OnExit(Professor inhabitant) {
        inhabitant.Display("{{bright eyed}} Ready for work.");
    }
}
