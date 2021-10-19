class Main {
    public static void main(String[] args) {
        String[][] ticTacToe = {{"O ", "X ", "X"},
                {"O ", "X ", "O"}, {"X ", "O ", "X"}};

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j]);
            }
            System.out.println();
        }
    }
}
