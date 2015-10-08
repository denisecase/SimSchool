package simschool.inhabitantStates;

import simschool.stateInterfaces.IProfessorState;
import simschool.inhabitants.Professor;

public class ProfessorSleepState implements IProfessorState {

    @Override
    public void OnEnter(Professor inhabitant) {
        inhabitant.Display("{{Yawn}} Going to sleep.");
    }

    @Override
    public void Execute(Professor inhabitant) {
        inhabitant.Display("{{dreaming}} ZZZzzzz  ZZZZZzzzz ");
        inhabitant.ChangeState((IProfessorState) new ProfessorGetHomeworkState());
    }

    @Override
    public void OnExit(Professor inhabitant) {
        inhabitant.Display("{{Smile}} What a beautiful day!");
    }

}
