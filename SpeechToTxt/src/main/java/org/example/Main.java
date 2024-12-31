package org.example;

import de.dfki.lt.deepspeech.Model;


public class Main {
    public static void main(String[] args) {
        try {
            // Load the model
            String modelPath = "/home/guhanpranav/Downloads/deepspeech-0.9.3-models.pbmm";
            Model model = new Model(modelPath);

            // Load the audio file
            String audioPath = "/home/guhanpranav/Downloads/live_recording.wav";
            byte[] audioData = AudioUtils.loadAudioFile(audioPath);

            // Perform speech recognition
            String text = model.stt(audioData);

            // Print the transcribed text
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}