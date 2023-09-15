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
    private Map<e_stateMachine, e_stateMachine[]> stateTransitions = new HashMap<>();

    /* Constructor */
    public StateMachine()
    {
        stateTransitions.put(e_stateMachine.IDLE, new e_stateMachine[]{e_stateMachine.START});
        /* */
        stateTransitions.put(e_stateMachine.START, new e_stateMachine[]
                {
                    e_stateMachine.NAME,
                    e_stateMachine.SURNAME,
                    e_stateMachine.AGE,
                    e_stateMachine.SPORT,
                    e_stateMachine.AWARDS,
                    e_stateMachine.EXIT
                });

        /* State after Name */
        stateTransitions.put(e_stateMachine.NAME, new e_stateMachine[]
                {
                        e_stateMachine.SURNAME,
                        e_stateMachine.AGE,
                        e_stateMachine.SPORT,
                        e_stateMachine.AWARDS,
                        e_stateMachine.EXIT
                });

        /* State after Surname */
        stateTransitions.put(e_stateMachine.SURNAME, new e_stateMachine[]
                {
                        e_stateMachine.NAME,
                        e_stateMachine.AGE,
                        e_stateMachine.SPORT,
                        e_stateMachine.AWARDS,
                        e_stateMachine.EXIT
                });

        /* State after Age */
        stateTransitions.put(e_stateMachine.AGE, new e_stateMachine[]
                {
                        e_stateMachine.NAME,
                        e_stateMachine.SURNAME,
                        e_stateMachine.SPORT,
                        e_stateMachine.AWARDS,
                        e_stateMachine.EXIT
                });

        /* State after Sport */
        stateTransitions.put(e_stateMachine.SPORT, new e_stateMachine[]
                {
                        e_stateMachine.NAME,
                        e_stateMachine.SURNAME,
                        e_stateMachine.AGE,
                        e_stateMachine.AWARDS,
                        e_stateMachine.EXIT
                });

        /* State after Awards */
        stateTransitions.put(e_stateMachine.AWARDS, new e_stateMachine[]
                {
                        e_stateMachine.NAME,
                        e_stateMachine.SURNAME,
                        e_stateMachine.AGE,
                        e_stateMachine.SPORT,
                        e_stateMachine.EXIT
                });

        /* State after Exit */
        stateTransitions.put(e_stateMachine.EXIT, new e_stateMachine[]
                {
                e_stateMachine.NAME,
                e_stateMachine.EXIT
                });
    }

    public e_stateMachine getCurrentState()
    {
        return l_currentState;
    }

    public void stm_NextState(e_stateMachine nextState)
    {
        e_stateMachine[] validStateTransitions = stateTransitions.get(l_currentState);
        if(validStateTransitions != null)
        {
            for(e_stateMachine validState : validStateTransitions)
            {
                if(validState == nextState)
                {
                    l_currentState = nextState;
                    System.out.println("New current state: " + l_currentState);
                    return;
                }
            }
        }
        System.out.println("Transition to new state invalid");
    }
}
