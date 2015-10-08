package simschool.inhabitantStates;

import simschool.inhabitants.Professor;
import simschool.stateInterfaces.IProfessorState;

public class ProfessorGetHomeworkState implements IProfessorState {

    @Override
    public void OnEnter(Professor inhabitant) {
        inhabitant.Display("Oh my, better get the new submissions!");
    }

    @Override
    public void Execute(Professor inhabitant) {
        inhabitant.Display("{{Yay}} Getting all the completed homework.");
        inhabitant.ChangeState(new ProfessorDrinkCoffeeState());
    }

    @Override
    public void OnExit(Professor inhabitant) {
        inhabitant.Display("{{Smile}} Looks good.");
    }
}
