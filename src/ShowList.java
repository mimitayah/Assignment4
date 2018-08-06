import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.System.out;

public class ShowList implements List<ShowList.ShowNode> {

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public ShowNode get(int index) {
        return null;
    }

    @Override
    public ShowNode set(int index, ShowNode element) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends ShowNode> c) {
        return false;
    }

    @Override
    public ListIterator<ShowNode> listIterator() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<ShowNode> iterator() {
        return null;
    }

    @Override
    public void add(int index, ShowNode element) {

    }

    @Override
    public boolean add(ShowNode showNode) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }


    @Override
    public ListIterator<ShowNode> listIterator(int index) {
        return null;
    }

    public ShowList(){
    List<ShowList> showNodeList = new ArrayList<>();
}

/*public ShowList copy(ShowList showList){
    showList = clone("second test");
}*/

public void insertAtIndex(TVShow tvShow, int index ) throws NoSuchElementException{
if (index <-1 || index>size-1){
    throw new NoSuchElementException();
}
    ShowList.ShowNode newElement = new ShowNode(tvShow, );
}

public void addToStart (TVShow tvShow){

    ShowList.ShowNode newElement = new ShowNode(tvShow, );
    newElement.add(0, );

}

    public class ShowNode {

        private TVShow tvShow;
        private Point;

        public ShowNode(){
            tvShow=null;
            showNode=null;
        }

        public ShowNode(TVShow tvShow, ShowNode showNode){
            this.showNode = showNode;
            this.tvShow = tvShow;
        }

        //copy constructor

        public ShowNode clone() {
            Scanner scanner = new Scanner(System.in);
            ShowNode showNodeClone = new ShowNode(tvShow, showNode);
            return showNodeClone;
        }

        public ShowNode getShowNode() {
            return showNode;
        }

        public TVShow getTvShow() {
            return tvShow;
        }

        public void setShowNode(ShowNode showNode) {
            this.showNode = showNode;
        }

        public void setTvShow(TVShow tvShow) {
            this.tvShow = tvShow;
        }
    }

}
