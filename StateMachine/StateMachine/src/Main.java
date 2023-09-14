public class Main {
    public static void main(String[] args)
    {
        StateMachine l_stateMachine = new StateMachine();

        System.out.println("Current State... " + l_stateMachine.getCurrentState());

        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.START);
        System.out.println("Current State... " + l_stateMachine.getCurrentState());

        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.NAME);
        System.out.println("Current State... " + l_stateMachine.getCurrentState());

        l_stateMachine.stm_NextState(StateMachine.e_stateMachine.SURNAME);
        System.out.println("Current State... " + l_stateMachine.getCurrentState());
    }
}