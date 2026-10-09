class CloudFile {

    protected String fileName;
    protected double fileSizeMB;

    void displayFileInfo() {

        System.out.println(
            "File Name: " + fileName
        );

        System.out.println(
            "File Size: " + fileSizeMB + " MB"
        );
    }
}


class ImageFile extends CloudFile {

    String resolution;

    void displayImageDetails() {

        System.out.println(
            "Image Resolution: " + resolution
        );
    }
}


class VideoFile extends CloudFile {

    int durationSeconds;

    void displayVideoDetails() {

        System.out.println(
            "Video Duration: "
            + durationSeconds + " seconds"
        );
    }
}


class DocumentFile extends CloudFile {

    int numberOfPages;

    void displayDocumentDetails() {

        System.out.println(
            "Number of Pages: " + numberOfPages
        );
    }
}


public class CloudStorageSystem {

    public static void main(String[] args) {

        ImageFile image = new ImageFile();

        image.fileName = "vacation.jpg";
        image.fileSizeMB = 5.5;
        image.resolution = "1920x1080";

        image.displayFileInfo();
        image.displayImageDetails();

        System.out.println("----------------");

        VideoFile video = new VideoFile();

        video.fileName = "tutorial.mp4";
        video.fileSizeMB = 500;
        video.durationSeconds = 900;

        video.displayFileInfo();
        video.displayVideoDetails();

        System.out.println("----------------");

        DocumentFile document =
            new DocumentFile();

        document.fileName = "report.pdf";
        document.fileSizeMB = 2.5;
        document.numberOfPages = 45;

        document.displayFileInfo();
        document.displayDocumentDetails();
    }
}
