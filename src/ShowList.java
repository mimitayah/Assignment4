import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowList<ShowNode> {

private ShowNode header;
private ShowNode size;

public ShowList(){
    List<ShowList> showNodeList = new ArrayList<>();
}

public ShowList copy(ShowList showList){
    showList = clone("caca");
}

    public class ShowNode {

        private TVShow tvShow;
        private ShowNode showNode;

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
