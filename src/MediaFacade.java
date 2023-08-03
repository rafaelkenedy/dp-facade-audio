public class MediaFacade {

    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private SubtitlePlayer subtitlePlayer;

    public MediaFacade() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        subtitlePlayer = new SubtitlePlayer();
    }

    public void playMedia(
            String audioFile,
            String videoFile,
            String subtitleFile
    ) {
        audioPlayer.playAudio(audioFile);
        videoPlayer.playVideo(videoFile);
        subtitlePlayer.playSubtitle(subtitleFile);
    }
}
