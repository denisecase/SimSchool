package simschool.inhabitants;

import simschool.stateInterfaces.IProfessorState;
import simschool.inhabitantStates.ProfessorGetHomeworkState;

/**
 *
 * @author deniselive
 */
public class Professor extends AbstractInhabitant {

    private IProfessorState currentState;

    public Professor() {
    }

    public Professor(String inputName) {
        super.name = inputName;
        this.currentState = new ProfessorGetHomeworkState();  // default state is "get homework"
    }

    @Override
    public void Execute() {
        this.currentState.Execute(this);
    }

    @Override
    public void Start() {
        super.Display("Hello, World!  Starting up.....");
        this.currentState = new ProfessorGetHomeworkState();  // start in "get homework"    }
    }

    @Override
    public void Finish() {
        super.Display("Nice work - see you next time!");
    }

    public void ChangeState(IProfessorState newState) {
        this.currentState = newState;
    }

    private void OnExit() {
        this.currentState.OnExit(this);
    }

}
