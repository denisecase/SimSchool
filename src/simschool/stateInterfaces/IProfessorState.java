package simschool.stateInterfaces;

import simschool.inhabitants.Professor;

public interface IProfessorState {

    void OnEnter(Professor inhabitant);

    void Execute(Professor inhabitant);

    void OnExit(Professor inhabitant);

}
