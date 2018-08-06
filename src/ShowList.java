import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowList<ShowNode> {

private ShowNode header;
private int size;

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
    newElement.add(1, )

}

    public class ShowNode {

        private TVShow tvShow;
        private PointShowNode showNode;

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
