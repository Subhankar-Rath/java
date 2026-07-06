public class ChessGame {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}
    interface chessPlayer{
        void moves();
    }
    class Rook implements chessPlayer{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }
    class Queen implements chessPlayer{
        public void moves(){
            System.out.println("up,down,left,right");
        }
    }
    
