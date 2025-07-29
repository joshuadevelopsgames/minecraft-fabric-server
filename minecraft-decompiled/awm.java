import java.nio.file.Path;
import java.util.Map;

interface awm {
   awm a = new awm() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   awm b = new awm() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public record a(Map<String, awj> c) implements awm {
      public Map<String, awj> a() {
         return this.c;
      }
   }

   public record b(Path c) implements awm {
      public Path a() {
         return this.c;
      }
   }
}
