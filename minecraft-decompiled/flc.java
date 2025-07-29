import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import javax.annotation.Nullable;

public class flc {
   private static final List<String> a = List.of(
      "i3-1000g1",
      "i3-1000g4",
      "i3-1000ng4",
      "i3-1005g1",
      "i3-l13g4",
      "i5-1030g4",
      "i5-1030g7",
      "i5-1030ng7",
      "i5-1034g1",
      "i5-1035g1",
      "i5-1035g4",
      "i5-1035g7",
      "i5-1038ng7",
      "i5-l16g7",
      "i7-1060g7",
      "i7-1060ng7",
      "i7-1065g7",
      "i7-1068g7",
      "i7-1068ng7"
   );
   private static final List<String> b = List.of("x6211e", "x6212re", "x6214re", "x6413e", "x6414re", "x6416re", "x6425e", "x6425re", "x6427fe");
   private static final List<String> c = List.of("j6412", "j6413", "n4500", "n4505", "n5095", "n5095a", "n5100", "n5105", "n6210", "n6211");
   private static final List<String> d = List.of("6805", "j6426", "n6415", "n6000", "n6005");
   @Nullable
   private static flc e;
   private final WeakReference<GpuDevice> f;
   private final boolean g;

   private flc(GpuDevice $$0) {
      this.f = new WeakReference<>($$0);
      this.g = b($$0);
   }

   public static flc a(GpuDevice $$0) {
      flc $$1 = e;
      if ($$1 == null || $$1.f.get() != $$0) {
         e = $$1 = new flc($$0);
      }

      return $$1;
   }

   public boolean a() {
      return this.g;
   }

   private static boolean b(GpuDevice $$0) {
      String $$1 = GLX._getCpuInfo().toLowerCase(Locale.ROOT);
      String $$2 = $$0.getRenderer().toLowerCase(Locale.ROOT);
      if (!$$1.contains("intel") || !$$2.contains("intel") || $$2.contains("mesa")) {
         return false;
      } else if ($$2.endsWith("gen11")) {
         return true;
      } else {
         return !$$2.contains("uhd graphics") && !$$2.contains("iris")
            ? false
            : $$1.contains("atom") && b.stream().anyMatch($$1::contains)
               || $$1.contains("celeron") && c.stream().anyMatch($$1::contains)
               || $$1.contains("pentium") && d.stream().anyMatch($$1::contains)
               || a.stream().anyMatch($$1::contains);
      }
   }
}
