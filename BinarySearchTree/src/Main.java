public class Main {
    public static void main(String[] args) {
        BinarySearchTree beyonceAlbumReleaseYears = new BinarySearchTree(2006);
        beyonceAlbumReleaseYears.insert(2016);
        beyonceAlbumReleaseYears.insert(2008);
        beyonceAlbumReleaseYears.insert(2022);
        beyonceAlbumReleaseYears.insert(2003);
        beyonceAlbumReleaseYears.depthFirstTraversal();
        System.out.println(beyonceAlbumReleaseYears.getNodeByValue(2022).value);
        System.out.println(beyonceAlbumReleaseYears.getNodeByValue(2007));
    }
}
