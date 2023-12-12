package app;

import java.util.List;
public class Scaffold {
        private final List<String> Scaffold;
        private int currentState;

        {
            Scaffold = List.of("""
                          \u001B[31m  +---+
                                |
                                |
                                |
                                |
                                |
                          =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                                  |
                                  |
                                  |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                                  |
                                  |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                              |   |
                                  |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                             /|   |
                                  |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                             /|\\  |
                                  |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                             /|\\  |
                             /    |
                                  |
                            =========\u001B[0m""",
                    """
                            \u001B[31m  +---+
                              |   |
                              0   |
                             /|\\  |
                             / \\  |
                                  |
                            GAME OVER
                            =========\u001B[0m""");
        }

        public void printScaffold() {
            System.out.println(Scaffold.get(currentState));
        }

        public void changeState() {
            currentState++;
        }

        public int getCurrentState() {
            return currentState;
        }
}
