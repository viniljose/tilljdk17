package com.vinil;

public class TextBlocks {
    public static void main(String[] args) {
        TextBlocks textBlocks = new TextBlocks();
        System.out.println(textBlocks.html());
        System.out.println(textBlocks.getIgnoredNewLines());
        System.out.println(textBlocks.getTextWithEscapes());
    }

    private String html(){
        return """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
    }

    private String getIgnoredNewLines() {
        return """
            This is a long text which looks to \
            have a newline but actually does not""";
    }
    
    private String getTextWithEscapes() {
        return """
            "fun" with
            whitespace
            and other escapes \"""
            """;
    }
}
