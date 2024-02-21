public class ScoreBoard {
    private GameEntry[] board;
    private int NumOfEnteries=0;
     public ScoreBoard(int Capacity){
         board=new GameEntry[Capacity];
     }

    public void add(GameEntry e){
         int newScore=e.getScore();
         if (NumOfEnteries< board.length || newScore>board[NumOfEnteries-1].getScore())
         {
             if(NumOfEnteries<board.length)
                 NumOfEnteries++;
             int j=NumOfEnteries-1;
             while (j>0 && newScore>board[j-1].getScore()){
                 board[j]=board[j-1];
                 j--;
             }
             board[j]=e;

         }
    }

    public GameEntry remove(int index)throws IndexOutOfBoundsException{
         if(index<0||index<NumOfEnteries-1)
             throw new =IndexOutOfBoundsException("invalid index"+index);
         GameEntry deleteed=board[index];
         for (int i=index; i<NumOfEnteries-1 ; i++){
             board[i]=board[i+1];
         }
         board[NumOfEnteries-1]=null;
         NumOfEnteries--;
         return deleteed;




    }
    public void viewAll(){
        System.out.println("[");
        for (GameEntry g:board){
            System.out.println(g +" ");
        }
    }
}
