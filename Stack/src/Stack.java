
public class Stack {

    protected int maxPos = 4;
    protected int top;
    protected int[] ArrayAux;

    public Stack(){
        top = 0;
        ArrayAux = new int[maxPos];
        for (int i = 0; i < maxPos; i++){
            ArrayAux[i] = 0;
        }
    }

    public Stack(int mp){
        top = 0;
        maxPos = mp;
        ArrayAux = new int[maxPos];
        for (int i = 0; i < maxPos; i++){
            ArrayAux[i] = 0;
        }
    }

    public void setMaxPos(int mp){
        maxPos = mp;
    }
    public int getMaxPos(){
        return maxPos;
    }

    public void setTop(int tp){
        top = tp;
    }
    public int getTop(){
        return top;
    }
    /**
     * Los métodos que se deberán definir para esta clase serán el método push que inserta
     *  un elemento al Stack y el método pop que saca el último elemento insertado en el Stack,
     *   así como sobreescribir el método toString
     */


    //push
    public void Push(int v){
        if (top == -1){
            top ++;
        }

        try{

            if (top >= maxPos) {
                throw new FullStackException("can't push, stack full");
            }
            ArrayAux[top] = v;
            top ++;


        }catch(FullStackException e) {
            System.err.println("FullStackException: " + e.getMessage());
        }

    }

    /**
     * example
     try {

     } catch (IndexOutOfBoundsException e) {
     System.err.println("IndexOutOfBoundsException: " + e.getMessage());
     }
     * @return
     */

    //pop

    public void Pop(){
        if (top == maxPos){
            top --;
        }
        try {
            if (top < 0){
                throw new EmptyStackException("can't pop, stack empty");
            }
            ArrayAux[top] = 0;
            top --;

        }catch(EmptyStackException e) {
            System.err.println("EmptyStackException: " + e.getMessage());
        }
    }

    public String toString(){
        String aux = "";
        for(int i = 0; i < maxPos; i++){
            aux = aux + ArrayAux[i];
        }
        return aux;
    }
}