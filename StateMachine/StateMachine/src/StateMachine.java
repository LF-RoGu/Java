import java.util.HashMap;
import java.util.Map;

public class StateMachine
{
    public enum e_stateMachine
    {
        IDLE,
        START,
        NAME,
        SURNAME,
        AGE,
        SPORT,
        AWARDS,
        EXIT
    }
    private e_stateMachine l_currentState = e_stateMachine.IDLE;
    private e_stateMachine l_nextState = e_stateMachine.START;
    private Map<e_stateMachine, e_stateMachine> stateTransitions = new HashMap<>();

    /* Constructor */
    public StateMachine()
    {
        stateTransitions.put(e_stateMachine.IDLE, e_stateMachine.START);
        /* */
        stateTransitions.put(e_stateMachine.START, e_stateMachine.NAME);

        /* State after Name */
        stateTransitions.put(e_stateMachine.NAME, e_stateMachine.SURNAME);

        /* State after Surname */
        stateTransitions.put(e_stateMachine.SURNAME, e_stateMachine.NAME);

        /* State after Age */
        stateTransitions.put(e_stateMachine.AGE, e_stateMachine.NAME);

        /* State after Sport */
        stateTransitions.put(e_stateMachine.SPORT, e_stateMachine.NAME);

        /* State after Awards */
        stateTransitions.put(e_stateMachine.AWARDS, e_stateMachine.NAME);

        /* State after Exit */
        stateTransitions.put(e_stateMachine.EXIT, e_stateMachine.EXIT);
    }

    public e_stateMachine getCurrentState()
    {
        return l_currentState;
    }

    public void stm_NextState(e_stateMachine nextState)
    {
        if(stateTransitions.containsKey(l_currentState) && stateTransitions.get(l_currentState) == nextState)
        {
            l_currentState = nextState;
            System.out.println("New current state: " + l_currentState);
        }
        else
        {
            System.out.println("Transition to new state invalid");
        }
    }
}
