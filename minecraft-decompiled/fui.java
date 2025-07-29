import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;

public class fui {
   static final Logger ag = LogUtils.getLogger();
   static final Gson ah = new Gson();
   private static final TypeToken<List<String>> ai = new TypeToken<List<String>>() {};
   public static final int a = 2;
   public static final int b = 4;
   public static final int c = 8;
   public static final int d = 12;
   public static final int e = 16;
   public static final int f = 32;
   private static final Splitter aj = Splitter.on(':').limit(2);
   public static final String g = "";
   private static final xo ak = xo.c("options.darkMojangStudiosBackgroundColor.tooltip");
   private final fuh<Boolean> al = fuh.a("options.darkMojangStudiosBackgroundColor", fuh.a(ak), false);
   private static final xo am = xo.c("options.hideLightningFlashes.tooltip");
   private final fuh<Boolean> an = fuh.a("options.hideLightningFlashes", fuh.a(am), false);
   private static final xo ao = xo.c("options.hideSplashTexts.tooltip");
   private final fuh<Boolean> ap = fuh.a("options.hideSplashTexts", fuh.a(ao), false);
   private final fuh<Double> aq = new fuh<>("options.sensitivity", fuh.a(), ($$0x, $$1x) -> {
      if ($$1x == 0.0) {
         return a($$0x, xo.c("options.sensitivity.min"));
      } else {
         return $$1x == 1.0 ? a($$0x, xo.c("options.sensitivity.max")) : a($$0x, 2.0 * $$1x);
      }
   }, fuh.m.a, 0.5, $$0x -> {});
   private final fuh<Integer> ar;
   private final fuh<Integer> as;
   private int at = 0;
   private final fuh<Double> au = new fuh<>(
      "options.entityDistanceScaling",
      fuh.a(),
      fui::a,
      new fuh.f(2, 20).a($$0x -> $$0x / 4.0, $$0x -> (int)($$0x * 4.0)),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      $$0x -> {}
   );
   public static final int h = 260;
   private final fuh<Integer> av = new fuh<>(
      "options.framerateLimit",
      fuh.a(),
      ($$0x, $$1x) -> $$1x == 260 ? a($$0x, xo.c("options.framerateLimit.max")) : a($$0x, xo.a("options.framerate", $$1x)),
      new fuh.f(1, 26).a($$0x -> $$0x * 10, $$0x -> $$0x / 10),
      Codec.intRange(10, 260),
      120,
      $$0x -> fue.R().aQ().a($$0x)
   );
   private static final xo aw = xo.c("options.inactivityFpsLimit.minimized.tooltip");
   private static final xo ax = xo.c("options.inactivityFpsLimit.afk.tooltip");
   private final fuh<fua> ay = new fuh<>("options.inactivityFpsLimit", $$0x -> {
      return switch ($$0x) {
         case a -> fzb.a(aw);
         case b -> fzb.a(ax);
      };
   }, fuh.b(), new fuh.e<>(Arrays.asList(fua.values()), fua.c), fua.b, $$0x -> {});
   private final fuh<ftq> az = new fuh<>(
      "options.renderClouds",
      fuh.a(),
      fuh.b(),
      new fuh.e<>(Arrays.asList(ftq.values()), Codec.withAlternative(ftq.d, Codec.BOOL, $$0x -> $$0x ? ftq.c : ftq.a)),
      ftq.c,
      $$0x -> {}
   );
   private final fuh<Integer> aA = new fuh<>(
      "options.renderCloudsDistance", fuh.a(), ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)), new fuh.f(2, 128, true), 128, $$0x -> fue.R().f.z().a()
   );
   private static final xo aB = xo.c("options.graphics.fast.tooltip");
   private static final xo aC = xo.a("options.graphics.fabulous.tooltip", xo.c("options.graphics.fabulous").a(o.u));
   private static final xo aD = xo.c("options.graphics.fancy.tooltip");
   private final fuh<ftw> aE = new fuh<>(
      "options.graphics",
      $$0x -> {
         return switch ($$0x) {
            case b -> fzb.a(aD);
            case a -> fzb.a(aB);
            case c -> fzb.a(aC);
         };
      },
      ($$0x, $$1x) -> {
         yc $$2x = xo.c($$1x.a());
         return $$1x == ftw.c ? $$2x.a(o.u) : $$2x;
      },
      new fuh.a<>(
         Arrays.asList(ftw.values()),
         Stream.of(ftw.values()).filter($$0x -> $$0x != ftw.c).collect(Collectors.toList()),
         () -> fue.R().r() && fue.R().ak().g(),
         ($$0x, $$1x) -> {
            fue $$2x = fue.R();
            gxd $$3 = $$2x.ak();
            if ($$1x == ftw.c && $$3.b()) {
               $$3.c();
            } else {
               $$0x.a($$1x);
               $$2x.f.d();
            }
         },
         Codec.INT.xmap(ftw::a, ftw::b)
      ),
      ftw.b,
      $$0x -> {}
   );
   private final fuh<Boolean> aF = fuh.a("options.ao", true, $$0x -> fue.R().f.d());
   private static final xo aG = xo.c("options.prioritizeChunkUpdates.none.tooltip");
   private static final xo aH = xo.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final xo aI = xo.c("options.prioritizeChunkUpdates.nearby.tooltip");
   private final fuh<fuk> aJ = new fuh<>("options.prioritizeChunkUpdates", $$0x -> {
      return switch ($$0x) {
         case a -> fzb.a(aG);
         case b -> fzb.a(aH);
         case c -> fzb.a(aI);
      };
   }, fuh.b(), new fuh.e<>(Arrays.asList(fuk.values()), Codec.INT.xmap(fuk::a, fuk::b)), fuk.a, $$0x -> {});
   public List<String> i = Lists.newArrayList();
   public List<String> j = Lists.newArrayList();
   private final fuh<cuq> aK = new fuh<>(
      "options.chat.visibility", fuh.a(), fuh.b(), new fuh.e<>(Arrays.asList(cuq.values()), Codec.INT.xmap(cuq::a, cuq::b)), cuq.a, $$0x -> {}
   );
   private final fuh<Double> aL = new fuh<>("options.chat.opacity", fuh.a(), ($$0x, $$1x) -> a($$0x, $$1x * 0.9 + 0.1), fuh.m.a, 1.0, $$0x -> fue.R().m.e().b());
   private final fuh<Double> aM = new fuh<>("options.chat.line_spacing", fuh.a(), fui::a, fuh.m.a, 0.0, $$0x -> {});
   private static final xo aN = xo.c("options.accessibility.menu_background_blurriness.tooltip");
   private static final int aO = 5;
   private final fuh<Integer> aP = new fuh<>("options.accessibility.menu_background_blurriness", fuh.a(aN), fui::b, new fuh.f(0, 10), 5, $$0x -> {});
   private final fuh<Double> aQ = new fuh<>("options.accessibility.text_background_opacity", fuh.a(), fui::a, fuh.m.a, 0.5, $$0x -> fue.R().m.e().b());
   private final fuh<Double> aR = new fuh<>("options.accessibility.panorama_speed", fuh.a(), fui::a, fuh.m.a, 1.0, $$0x -> {});
   private static final xo aS = xo.c("options.accessibility.high_contrast.tooltip");
   private final fuh<Boolean> aT = fuh.a("options.accessibility.high_contrast", fuh.a(aS), false, $$0x -> {
      awz $$1x = fue.R().ae();
      boolean $$2x = $$1x.e().contains("high_contrast");
      if (!$$2x && $$0x) {
         if ($$1x.a("high_contrast")) {
            this.a($$1x);
         }
      } else if ($$2x && !$$0x && $$1x.b("high_contrast")) {
         this.a($$1x);
      }
   });
   private static final xo aU = xo.c("options.accessibility.high_contrast_block_outline.tooltip");
   private final fuh<Boolean> aV = fuh.a("options.accessibility.high_contrast_block_outline", fuh.a(aU), false);
   private final fuh<Boolean> aW = fuh.a(
      "options.accessibility.narrator_hotkey",
      fuh.a(fue.a ? xo.c("options.accessibility.narrator_hotkey.mac.tooltip") : xo.c("options.accessibility.narrator_hotkey.tooltip")),
      true
   );
   @Nullable
   public String k;
   public boolean l;
   public boolean m;
   public boolean n = true;
   private final Set<cuv> aX = EnumSet.allOf(cuv.class);
   private final fuh<cad> aY = new fuh<>("options.mainHand", fuh.a(), fuh.b(), new fuh.e<>(Arrays.asList(cad.values()), cad.c), cad.b, $$0x -> {});
   public int o;
   public int p;
   private final fuh<Double> aZ = new fuh<>(
      "options.chat.scale",
      fuh.a(),
      ($$0x, $$1x) -> (xo)($$1x == 0.0 ? xn.a($$0x, false) : a($$0x, $$1x.doubleValue())),
      fuh.m.a,
      1.0,
      $$0x -> fue.R().m.e().b()
   );
   private final fuh<Double> ba = new fuh<>("options.chat.width", fuh.a(), ($$0x, $$1x) -> c($$0x, fxp.a($$1x)), fuh.m.a, 1.0, $$0x -> fue.R().m.e().b());
   private final fuh<Double> bb = new fuh<>(
      "options.chat.height.unfocused", fuh.a(), ($$0x, $$1x) -> c($$0x, fxp.b($$1x)), fuh.m.a, fxp.i(), $$0x -> fue.R().m.e().b()
   );
   private final fuh<Double> bc = new fuh<>(
      "options.chat.height.focused", fuh.a(), ($$0x, $$1x) -> c($$0x, fxp.b($$1x)), fuh.m.a, 1.0, $$0x -> fue.R().m.e().b()
   );
   private final fuh<Double> bd = new fuh<>(
      "options.chat.delay_instant",
      fuh.a(),
      ($$0x, $$1x) -> $$1x <= 0.0 ? xo.c("options.chat.delay_none") : xo.a("options.chat.delay", String.format(Locale.ROOT, "%.1f", $$1x)),
      new fuh.f(0, 60).a($$0x -> $$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      $$0x -> fue.R().ba().a($$0x)
   );
   private static final xo be = xo.c("options.notifications.display_time.tooltip");
   private final fuh<Double> bf = new fuh<>(
      "options.notifications.display_time",
      fuh.a(be),
      ($$0x, $$1x) -> a($$0x, xo.a("options.multiplier", $$1x)),
      new fuh.f(5, 100).a($$0x -> $$0x / 10.0, $$0x -> (int)($$0x * 10.0)),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      $$0x -> {}
   );
   private final fuh<Integer> bg = new fuh<>(
      "options.mipmapLevels", fuh.a(), ($$0x, $$1x) -> (xo)($$1x == 0 ? xn.a($$0x, false) : a($$0x, $$1x.intValue())), new fuh.f(0, 4), 4, $$0x -> {}
   );
   public boolean q = true;
   private final fuh<ftl> bh = new fuh<>(
      "options.attackIndicator", fuh.a(), fuh.b(), new fuh.e<>(Arrays.asList(ftl.values()), Codec.INT.xmap(ftl::a, ftl::b)), ftl.b, $$0x -> {}
   );
   public hyb r = hyb.a;
   public boolean s = false;
   private final fuh<Integer> bi = new fuh<>("options.biomeBlendRadius", fuh.a(), ($$0x, $$1x) -> {
      int $$2x = $$1x * 2 + 1;
      return a($$0x, xo.c("options.biomeBlendRadius." + $$2x));
   }, new fuh.f(0, 7, false), 2, $$0x -> fue.R().f.d());
   private final fuh<Double> bj = new fuh<>(
      "options.mouseWheelSensitivity",
      fuh.a(),
      ($$0x, $$1x) -> a($$0x, xo.b(String.format(Locale.ROOT, "%.2f", $$1x))),
      new fuh.f(-200, 100).a(fui::c, fui::a),
      Codec.doubleRange(c(-200), c(100)),
      c(0),
      $$0x -> {}
   );
   private final fuh<Boolean> bk = fuh.a("options.rawMouseInput", true, $$0x -> {
      fni $$1x = fue.R().aP();
      if ($$1x != null) {
         $$1x.b($$0x);
      }
   });
   public int t = 1;
   private final fuh<Boolean> bl = fuh.a("options.autoJump", false);
   private static final xo bm = xo.c("options.rotateWithMinecart.tooltip");
   private final fuh<Boolean> bn = fuh.a("options.rotateWithMinecart", fuh.a(bm), false);
   private final fuh<Boolean> bo = fuh.a("options.operatorItemsTab", false);
   private final fuh<Boolean> bp = fuh.a("options.autoSuggestCommands", true);
   private final fuh<Boolean> bq = fuh.a("options.chat.color", true);
   private final fuh<Boolean> br = fuh.a("options.chat.links", true);
   private final fuh<Boolean> bs = fuh.a("options.chat.links.prompt", true);
   private final fuh<Boolean> bt = fuh.a("options.vsync", true, $$0x -> {
      if (fue.R().aP() != null) {
         fue.R().aP().a($$0x);
      }
   });
   private final fuh<Boolean> bu = fuh.a("options.entityShadows", true);
   private final fuh<Boolean> bv = fuh.a("options.forceUnicodeFont", false, $$0x -> aL());
   private final fuh<Boolean> bw = fuh.a("options.japaneseGlyphVariants", fuh.a(xo.c("options.japaneseGlyphVariants.tooltip")), aM(), $$0x -> aL());
   private final fuh<Boolean> bx = fuh.a("options.invertMouse", false);
   private final fuh<Boolean> by = fuh.a("options.discrete_mouse_scroll", false);
   private static final xo bz = xo.c("options.realmsNotifications.tooltip");
   private final fuh<Boolean> bA = fuh.a("options.realmsNotifications", fuh.a(bz), true);
   private static final xo bB = xo.c("options.allowServerListing.tooltip");
   private final fuh<Boolean> bC = fuh.a("options.allowServerListing", fuh.a(bB), true, $$0x -> {});
   private final fuh<Boolean> bD = fuh.a("options.reducedDebugInfo", false);
   private final Map<aza, fuh<Double>> bE = ag.a(aza.class, $$0x -> this.a("soundCategory." + $$0x.a(), $$0x));
   private final fuh<Boolean> bF = fuh.a("options.showSubtitles", false);
   private static final xo bG = xo.c("options.directionalAudio.on.tooltip");
   private static final xo bH = xo.c("options.directionalAudio.off.tooltip");
   private final fuh<Boolean> bI = fuh.a("options.directionalAudio", $$0x -> $$0x ? fzb.a(bG) : fzb.a(bH), false, $$0x -> {
      hwx $$1x = fue.R().al();
      $$1x.i();
      $$1x.a(hvm.a(ayz.BU, 1.0F));
   });
   private final fuh<Boolean> bJ = new fuh<>(
      "options.accessibility.text_background",
      fuh.a(),
      ($$0x, $$1x) -> $$1x ? xo.c("options.accessibility.text_background.chat") : xo.c("options.accessibility.text_background.everywhere"),
      fuh.a,
      true,
      $$0x -> {}
   );
   private final fuh<Boolean> bK = fuh.a("options.touchscreen", false);
   private final fuh<Boolean> bL = fuh.a("options.fullscreen", false, $$0x -> {
      fue $$1x = fue.R();
      if ($$1x.aP() != null && $$1x.aP().i() != $$0x) {
         $$1x.aP().g();
         this.ae().a($$1x.aP().i());
      }
   });
   private final fuh<Boolean> bM = fuh.a("options.viewBobbing", true);
   private static final xo bN = xo.c("options.key.toggle");
   private static final xo bO = xo.c("options.key.hold");
   private final fuh<Boolean> bP = new fuh<>("key.sneak", fuh.a(), ($$0x, $$1x) -> $$1x ? bN : bO, fuh.a, false, $$0x -> {});
   private final fuh<Boolean> bQ = new fuh<>("key.sprint", fuh.a(), ($$0x, $$1x) -> $$1x ? bN : bO, fuh.a, false, $$0x -> {});
   public boolean u;
   private static final xo bR = xo.c("options.hideMatchedNames.tooltip");
   private final fuh<Boolean> bS = fuh.a("options.hideMatchedNames", fuh.a(bR), true);
   private final fuh<Boolean> bT = fuh.a("options.autosaveIndicator", true);
   private static final xo bU = xo.c("options.onlyShowSecureChat.tooltip");
   private final fuh<Boolean> bV = fuh.a("options.onlyShowSecureChat", fuh.a(bU), false);
   public final fuc v = new fuc("key.forward", 87, "key.categories.movement");
   public final fuc w = new fuc("key.left", 65, "key.categories.movement");
   public final fuc x = new fuc("key.back", 83, "key.categories.movement");
   public final fuc y = new fuc("key.right", 68, "key.categories.movement");
   public final fuc z = new fuc("key.jump", 32, "key.categories.movement");
   public final fuc A = new fup("key.sneak", 340, "key.categories.movement", this.bP::c);
   public final fuc B = new fup("key.sprint", 341, "key.categories.movement", this.bQ::c);
   public final fuc C = new fuc("key.inventory", 69, "key.categories.inventory");
   public final fuc D = new fuc("key.swapOffhand", 70, "key.categories.inventory");
   public final fuc E = new fuc("key.drop", 81, "key.categories.inventory");
   public final fuc F = new fuc("key.use", fna.b.c, 1, "key.categories.gameplay");
   public final fuc G = new fuc("key.attack", fna.b.c, 0, "key.categories.gameplay");
   public final fuc H = new fuc("key.pickItem", fna.b.c, 2, "key.categories.gameplay");
   public final fuc I = new fuc("key.chat", 84, "key.categories.multiplayer");
   public final fuc J = new fuc("key.playerlist", 258, "key.categories.multiplayer");
   public final fuc K = new fuc("key.command", 47, "key.categories.multiplayer");
   public final fuc L = new fuc("key.socialInteractions", 80, "key.categories.multiplayer");
   public final fuc M = new fuc("key.screenshot", 291, "key.categories.misc");
   public final fuc N = new fuc("key.togglePerspective", 294, "key.categories.misc");
   public final fuc O = new fuc("key.smoothCamera", fna.bv.b(), "key.categories.misc");
   public final fuc P = new fuc("key.fullscreen", 300, "key.categories.misc");
   public final fuc Q = new fuc("key.spectatorOutlines", fna.bv.b(), "key.categories.misc");
   public final fuc R = new fuc("key.advancements", 76, "key.categories.misc");
   public final fuc S = new fuc("key.quickActions", 71, "key.categories.misc");
   public final fuc[] T = new fuc[]{
      new fuc("key.hotbar.1", 49, "key.categories.inventory"),
      new fuc("key.hotbar.2", 50, "key.categories.inventory"),
      new fuc("key.hotbar.3", 51, "key.categories.inventory"),
      new fuc("key.hotbar.4", 52, "key.categories.inventory"),
      new fuc("key.hotbar.5", 53, "key.categories.inventory"),
      new fuc("key.hotbar.6", 54, "key.categories.inventory"),
      new fuc("key.hotbar.7", 55, "key.categories.inventory"),
      new fuc("key.hotbar.8", 56, "key.categories.inventory"),
      new fuc("key.hotbar.9", 57, "key.categories.inventory")
   };
   public final fuc U = new fuc("key.saveToolbarActivator", 67, "key.categories.creative");
   public final fuc V = new fuc("key.loadToolbarActivator", 88, "key.categories.creative");
   public final fuc[] W = (fuc[])ArrayUtils.addAll(
      new fuc[]{
         this.G,
         this.F,
         this.v,
         this.w,
         this.x,
         this.y,
         this.z,
         this.A,
         this.B,
         this.E,
         this.C,
         this.I,
         this.J,
         this.H,
         this.K,
         this.L,
         this.M,
         this.N,
         this.O,
         this.P,
         this.Q,
         this.D,
         this.U,
         this.V,
         this.R,
         this.S
      },
      this.T
   );
   protected fue X;
   private final File bW;
   public boolean Y;
   private ftn bX = ftn.a;
   public String Z = "";
   public boolean aa;
   private final fuh<Integer> bY = new fuh<>("options.fov", fuh.a(), ($$0x, $$1x) -> {
      return switch ($$1x) {
         case 70 -> a($$0x, xo.c("options.fov.min"));
         case 110 -> a($$0x, xo.c("options.fov.max"));
         default -> a($$0x, $$1x.intValue());
      };
   }, new fuh.f(30, 110), Codec.DOUBLE.xmap($$0x -> (int)($$0x * 40.0 + 70.0), $$0x -> ($$0x.intValue() - 70.0) / 40.0), 70, $$0x -> fue.R().f.p());
   private static final xo bZ = xo.a("options.telemetry.button.tooltip", xo.c("options.telemetry.state.minimal"), xo.c("options.telemetry.state.all"));
   private final fuh<Boolean> ca = fuh.a("options.telemetry.button", fuh.a(bZ), ($$0x, $$1x) -> {
      fue $$2x = fue.R();
      if (!$$2x.F()) {
         return xo.c("options.telemetry.state.none");
      } else {
         return $$1x && $$2x.E() ? xo.c("options.telemetry.state.all") : xo.c("options.telemetry.state.minimal");
      }
   }, false, $$0x -> {});
   private static final xo cb = xo.c("options.screenEffectScale.tooltip");
   private final fuh<Double> cc = new fuh<>("options.screenEffectScale", fuh.a(cb), fui::b, fuh.m.a, 1.0, $$0x -> {});
   private static final xo cd = xo.c("options.fovEffectScale.tooltip");
   private final fuh<Double> ce = new fuh<>(
      "options.fovEffectScale", fuh.a(cd), fui::b, fuh.m.a.a(bcb::k, Math::sqrt), Codec.doubleRange(0.0, 1.0), 1.0, $$0x -> {}
   );
   private static final xo cf = xo.c("options.darknessEffectScale.tooltip");
   private final fuh<Double> cg = new fuh<>("options.darknessEffectScale", fuh.a(cf), fui::b, fuh.m.a.a(bcb::k, Math::sqrt), 1.0, $$0x -> {});
   private static final xo ch = xo.c("options.glintSpeed.tooltip");
   private final fuh<Double> ci = new fuh<>("options.glintSpeed", fuh.a(ch), fui::b, fuh.m.a, 0.5, $$0x -> {});
   private static final xo cj = xo.c("options.glintStrength.tooltip");
   private final fuh<Double> ck = new fuh<>("options.glintStrength", fuh.a(cj), fui::b, fuh.m.a, 0.75, $$0x -> {});
   private static final xo cl = xo.c("options.damageTiltStrength.tooltip");
   private final fuh<Double> cm = new fuh<>("options.damageTiltStrength", fuh.a(cl), fui::b, fuh.m.a, 1.0, $$0x -> {});
   private final fuh<Double> cn = new fuh<>("options.gamma", fuh.a(), ($$0x, $$1x) -> {
      int $$2x = (int)($$1x * 100.0);
      if ($$2x == 0) {
         return a($$0x, xo.c("options.gamma.min"));
      } else if ($$2x == 50) {
         return a($$0x, xo.c("options.gamma.default"));
      } else {
         return $$2x == 100 ? a($$0x, xo.c("options.gamma.max")) : a($$0x, $$2x);
      }
   }, fuh.m.a, 0.5, $$0x -> {});
   public static final int ab = 0;
   private static final int co = 2147483646;
   private final fuh<Integer> cp = new fuh<>(
      "options.guiScale", fuh.a(), ($$0x, $$1x) -> $$1x == 0 ? xo.c("options.guiScale.auto") : xo.b(Integer.toString($$1x)), new fuh.c(0, () -> {
         fue $$0x = fue.R();
         return !$$0x.r() ? 2147483646 : $$0x.aP().a(0, $$0x.k());
      }, 2147483646), 0, $$0x -> this.X.a()
   );
   private final fuh<att> cq = new fuh<>(
      "options.particles", fuh.a(), fuh.b(), new fuh.e<>(Arrays.asList(att.values()), Codec.INT.xmap(att::a, att::b)), att.a, $$0x -> {}
   );
   private final fuh<fug> cr = new fuh<>(
      "options.narrator",
      fuh.a(),
      ($$0x, $$1x) -> (xo)(this.X.aZ().a() ? $$1x.b() : xo.c("options.narrator.notavailable")),
      new fuh.e<>(Arrays.asList(fug.values()), Codec.INT.xmap(fug::a, fug::a)),
      fug.a,
      $$0x -> this.X.aZ().a($$0x)
   );
   public String ac = "en_us";
   private final fuh<String> cs = new fuh<>(
      "options.audioDevice",
      fuh.a(),
      ($$0x, $$1x) -> {
         if ("".equals($$1x)) {
            return xo.c("options.audioDevice.default");
         } else {
            return $$1x.startsWith("OpenAL Soft on ") ? xo.b($$1x.substring(hwu.c)) : xo.b($$1x);
         }
      },
      new fuh.h<>(
         () -> Stream.concat(Stream.of(""), fue.R().al().a().stream()).toList(),
         $$0x -> fue.R().r() && $$0x != "" && !fue.R().al().a().contains($$0x) ? Optional.empty() : Optional.of($$0x),
         Codec.STRING
      ),
      "",
      $$0x -> {
         hwx $$1x = fue.R().al();
         $$1x.i();
         $$1x.a(hvm.a(ayz.BU, 1.0F));
      }
   );
   public boolean ad = true;
   private static final xo ct = xo.c("options.music_frequency.tooltip");
   private final fuh<hws.a> cu = new fuh<>(
      "options.music_frequency", fuh.a(ct), fuh.b(), new fuh.e<>(Arrays.asList(hws.a.values()), hws.a.d), hws.a.a, $$0x -> fue.R().s().a($$0x)
   );
   private static final xo cv = xo.c("options.showNowPlayingToast.tooltip");
   private final fuh<Boolean> cw = fuh.a("options.showNowPlayingToast", fuh.a(cv), false, $$0x -> {
      if ($$0x) {
         this.X.aB().e();
      } else {
         this.X.aB().f();
      }
   });
   public boolean ae;
   public boolean af = true;

   public fuh<Boolean> a() {
      return this.al;
   }

   public fuh<Boolean> b() {
      return this.an;
   }

   public fuh<Boolean> c() {
      return this.ap;
   }

   public fuh<Double> d() {
      return this.aq;
   }

   public fuh<Integer> e() {
      return this.ar;
   }

   public fuh<Integer> f() {
      return this.as;
   }

   public fuh<Double> g() {
      return this.au;
   }

   public fuh<Integer> h() {
      return this.av;
   }

   public fuh<fua> i() {
      return this.ay;
   }

   public fuh<ftq> j() {
      return this.az;
   }

   public fuh<Integer> k() {
      return this.aA;
   }

   public fuh<ftw> l() {
      return this.aE;
   }

   public fuh<Boolean> m() {
      return this.aF;
   }

   public fuh<fuk> n() {
      return this.aJ;
   }

   public void a(awz $$0) {
      List<String> $$1 = ImmutableList.copyOf(this.i);
      this.i.clear();
      this.j.clear();

      for (aww $$2 : $$0.g()) {
         if (!$$2.j()) {
            this.i.add($$2.g());
            if (!$$2.d().a()) {
               this.j.add($$2.g());
            }
         }
      }

      this.aC();
      List<String> $$3 = ImmutableList.copyOf(this.i);
      if (!$$3.equals($$1)) {
         this.X.l();
      }
   }

   public fuh<cuq> o() {
      return this.aK;
   }

   public fuh<Double> p() {
      return this.aL;
   }

   public fuh<Double> q() {
      return this.aM;
   }

   public fuh<Integer> r() {
      return this.aP;
   }

   public int s() {
      return this.r().c();
   }

   public fuh<Double> t() {
      return this.aQ;
   }

   public fuh<Double> u() {
      return this.aR;
   }

   public fuh<Boolean> v() {
      return this.aT;
   }

   public fuh<Boolean> w() {
      return this.aV;
   }

   public fuh<Boolean> x() {
      return this.aW;
   }

   public fuh<cad> y() {
      return this.aY;
   }

   public fuh<Double> z() {
      return this.aZ;
   }

   public fuh<Double> A() {
      return this.ba;
   }

   public fuh<Double> B() {
      return this.bb;
   }

   public fuh<Double> C() {
      return this.bc;
   }

   public fuh<Double> D() {
      return this.bd;
   }

   public fuh<Double> E() {
      return this.bf;
   }

   public fuh<Integer> F() {
      return this.bg;
   }

   public fuh<ftl> G() {
      return this.bh;
   }

   public fuh<Integer> H() {
      return this.bi;
   }

   private static double c(int $$0) {
      return Math.pow(10.0, $$0 / 100.0);
   }

   private static int a(double $$0) {
      return bcb.a(Math.log10($$0) * 100.0);
   }

   public fuh<Double> I() {
      return this.bj;
   }

   public fuh<Boolean> J() {
      return this.bk;
   }

   public fuh<Boolean> K() {
      return this.bl;
   }

   public fuh<Boolean> L() {
      return this.bn;
   }

   public fuh<Boolean> M() {
      return this.bo;
   }

   public fuh<Boolean> N() {
      return this.bp;
   }

   public fuh<Boolean> O() {
      return this.bq;
   }

   public fuh<Boolean> P() {
      return this.br;
   }

   public fuh<Boolean> Q() {
      return this.bs;
   }

   public fuh<Boolean> R() {
      return this.bt;
   }

   public fuh<Boolean> S() {
      return this.bu;
   }

   private static void aL() {
      fue $$0 = fue.R();
      if ($$0.aP() != null) {
         $$0.g();
         $$0.a();
      }
   }

   public fuh<Boolean> T() {
      return this.bv;
   }

   private static boolean aM() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public fuh<Boolean> U() {
      return this.bw;
   }

   public fuh<Boolean> V() {
      return this.bx;
   }

   public fuh<Boolean> W() {
      return this.by;
   }

   public fuh<Boolean> X() {
      return this.bA;
   }

   public fuh<Boolean> Y() {
      return this.bC;
   }

   public fuh<Boolean> Z() {
      return this.bD;
   }

   public final float a(aza $$0) {
      return $$0 == aza.a ? this.b($$0) : this.b($$0) * this.b(aza.a);
   }

   public final float b(aza $$0) {
      return this.c($$0).c().floatValue();
   }

   public final fuh<Double> c(aza $$0) {
      return Objects.requireNonNull(this.bE.get($$0));
   }

   private fuh<Double> a(String $$0, aza $$1) {
      return new fuh<>($$0, fuh.a(), fui::b, fuh.m.a, 1.0, $$1x -> fue.R().al().a($$1, $$1x.floatValue()));
   }

   public fuh<Boolean> aa() {
      return this.bF;
   }

   public fuh<Boolean> ab() {
      return this.bI;
   }

   public fuh<Boolean> ac() {
      return this.bJ;
   }

   public fuh<Boolean> ad() {
      return this.bK;
   }

   public fuh<Boolean> ae() {
      return this.bL;
   }

   public fuh<Boolean> af() {
      return this.bM;
   }

   public fuh<Boolean> ag() {
      return this.bP;
   }

   public fuh<Boolean> ah() {
      return this.bQ;
   }

   public fuh<Boolean> ai() {
      return this.bS;
   }

   public fuh<Boolean> aj() {
      return this.bT;
   }

   public fuh<Boolean> ak() {
      return this.bV;
   }

   public fuh<Integer> al() {
      return this.bY;
   }

   public fuh<Boolean> am() {
      return this.ca;
   }

   public fuh<Double> an() {
      return this.cc;
   }

   public fuh<Double> ao() {
      return this.ce;
   }

   public fuh<Double> ap() {
      return this.cg;
   }

   public fuh<Double> aq() {
      return this.ci;
   }

   public fuh<Double> ar() {
      return this.ck;
   }

   public fuh<Double> as() {
      return this.cm;
   }

   public fuh<Double> at() {
      return this.cn;
   }

   public fuh<Integer> au() {
      return this.cp;
   }

   public fuh<att> av() {
      return this.cq;
   }

   public fuh<fug> aw() {
      return this.cr;
   }

   public fuh<String> ax() {
      return this.cs;
   }

   public void ay() {
      this.ad = false;
      this.aC();
   }

   public fuh<hws.a> az() {
      return this.cu;
   }

   public fuh<Boolean> aA() {
      return this.cw;
   }

   public fui(fue $$0, File $$1) {
      this.X = $$0;
      this.bW = new File($$1, "options.txt");
      boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.ar = new fuh<>(
         "options.renderDistance",
         fuh.a(),
         ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)),
         new fuh.f(2, $$2 ? 32 : 16, false),
         12,
         $$0x -> fue.R().f.p()
      );
      this.as = new fuh<>(
         "options.simulationDistance", fuh.a(), ($$0x, $$1x) -> a($$0x, xo.a("options.chunks", $$1x)), new fuh.f(5, $$2 ? 32 : 16, false), 12, $$0x -> {}
      );
      this.ae = ag.n() == ag.a.c;
      this.aB();
   }

   public float a(float $$0) {
      return this.bJ.c() ? $$0 : this.t().c().floatValue();
   }

   public int b(float $$0) {
      return baj.a(this.a($$0), 0.0F, 0.0F, 0.0F);
   }

   public int a(int $$0) {
      return this.bJ.c() ? $$0 : baj.a(this.aQ.c().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void a(fui.b $$0) {
      $$0.a("ao", this.aF);
      $$0.a("biomeBlendRadius", this.bi);
      $$0.a("enableVsync", this.bt);
      $$0.a("entityDistanceScaling", this.au);
      $$0.a("entityShadows", this.bu);
      $$0.a("forceUnicodeFont", this.bv);
      $$0.a("japaneseGlyphVariants", this.bw);
      $$0.a("fov", this.bY);
      $$0.a("fovEffectScale", this.ce);
      $$0.a("darknessEffectScale", this.cg);
      $$0.a("glintSpeed", this.ci);
      $$0.a("glintStrength", this.ck);
      $$0.a("prioritizeChunkUpdates", this.aJ);
      $$0.a("fullscreen", this.bL);
      $$0.a("gamma", this.cn);
      $$0.a("graphicsMode", this.aE);
      $$0.a("guiScale", this.cp);
      $$0.a("maxFps", this.av);
      $$0.a("inactivityFpsLimit", this.ay);
      $$0.a("mipmapLevels", this.bg);
      $$0.a("narrator", this.cr);
      $$0.a("particles", this.cq);
      $$0.a("reducedDebugInfo", this.bD);
      $$0.a("renderClouds", this.az);
      $$0.a("cloudRange", this.aA);
      $$0.a("renderDistance", this.ar);
      $$0.a("simulationDistance", this.as);
      $$0.a("screenEffectScale", this.cc);
      $$0.a("soundDevice", this.cs);
   }

   private void a(fui.a $$0) {
      this.a((fui.b)$$0);
      $$0.a("autoJump", this.bl);
      $$0.a("rotateWithMinecart", this.bn);
      $$0.a("operatorItemsTab", this.bo);
      $$0.a("autoSuggestions", this.bp);
      $$0.a("chatColors", this.bq);
      $$0.a("chatLinks", this.br);
      $$0.a("chatLinksPrompt", this.bs);
      $$0.a("discrete_mouse_scroll", this.by);
      $$0.a("invertYMouse", this.bx);
      $$0.a("realmsNotifications", this.bA);
      $$0.a("showSubtitles", this.bF);
      $$0.a("directionalAudio", this.bI);
      $$0.a("touchscreen", this.bK);
      $$0.a("bobView", this.bM);
      $$0.a("toggleCrouch", this.bP);
      $$0.a("toggleSprint", this.bQ);
      $$0.a("darkMojangStudiosBackground", this.al);
      $$0.a("hideLightningFlashes", this.an);
      $$0.a("hideSplashTexts", this.ap);
      $$0.a("mouseSensitivity", this.aq);
      $$0.a("damageTiltStrength", this.cm);
      $$0.a("highContrast", this.aT);
      $$0.a("highContrastBlockOutline", this.aV);
      $$0.a("narratorHotkey", this.aW);
      this.i = $$0.a("resourcePacks", this.i, fui::c, ah::toJson);
      this.j = $$0.a("incompatibleResourcePacks", this.j, fui::c, ah::toJson);
      this.Z = $$0.a("lastServer", this.Z);
      this.ac = $$0.a("lang", this.ac);
      $$0.a("chatVisibility", this.aK);
      $$0.a("chatOpacity", this.aL);
      $$0.a("chatLineSpacing", this.aM);
      $$0.a("textBackgroundOpacity", this.aQ);
      $$0.a("backgroundForChatOnly", this.bJ);
      this.l = $$0.a("hideServerAddress", this.l);
      this.m = $$0.a("advancedItemTooltips", this.m);
      this.n = $$0.a("pauseOnLostFocus", this.n);
      this.o = $$0.a("overrideWidth", this.o);
      this.p = $$0.a("overrideHeight", this.p);
      $$0.a("chatHeightFocused", this.bc);
      $$0.a("chatDelay", this.bd);
      $$0.a("chatHeightUnfocused", this.bb);
      $$0.a("chatScale", this.aZ);
      $$0.a("chatWidth", this.ba);
      $$0.a("notificationDisplayTime", this.bf);
      this.q = $$0.a("useNativeTransport", this.q);
      $$0.a("mainHand", this.aY);
      $$0.a("attackIndicator", this.bh);
      this.r = $$0.a("tutorialStep", this.r, hyb::a, hyb::a);
      $$0.a("mouseWheelSensitivity", this.bj);
      $$0.a("rawMouseInput", this.bk);
      this.t = $$0.a("glDebugVerbosity", this.t);
      this.u = $$0.a("skipMultiplayerWarning", this.u);
      $$0.a("hideMatchedNames", this.bS);
      this.s = $$0.a("joinedFirstServer", this.s);
      this.ae = $$0.a("syncChunkWrites", this.ae);
      $$0.a("showAutosaveIndicator", this.bT);
      $$0.a("allowServerListing", this.bC);
      $$0.a("onlyShowSecureChat", this.bV);
      $$0.a("panoramaScrollSpeed", this.aR);
      $$0.a("telemetryOptInExtra", this.ca);
      this.ad = $$0.a("onboardAccessibility", this.ad);
      $$0.a("menuBackgroundBlurriness", this.aP);
      this.af = $$0.a("startedCleanly", this.af);
      $$0.a("showNowPlayingToast", this.cw);
      $$0.a("musicFrequency", this.cu);

      for (fuc $$1 : this.W) {
         String $$2 = $$1.m();
         String $$3 = $$0.a("key_" + $$1.h(), $$2);
         if (!$$2.equals($$3)) {
            $$1.b(fna.a($$3));
         }
      }

      for (aza $$4 : aza.values()) {
         $$0.a("soundCategory_" + $$4.a(), this.bE.get($$4));
      }

      for (cuv $$5 : cuv.values()) {
         boolean $$6 = this.aX.contains($$5);
         boolean $$7 = $$0.a("modelPart_" + $$5.c(), $$6);
         if ($$7 != $$6) {
            this.a($$5, $$7);
         }
      }
   }

   public void aB() {
      try {
         if (!this.bW.exists()) {
            return;
         }

         ui $$0 = new ui();

         try (BufferedReader $$1 = Files.newReader(this.bW, Charsets.UTF_8)) {
            $$1.lines().forEach($$1x -> {
               try {
                  Iterator<String> $$2x = aj.split($$1x).iterator();
                  $$0.a($$2x.next(), $$2x.next());
               } catch (Exception var3x) {
                  ag.warn("Skipping bad option: {}", $$1x);
               }
            });
         }

         final ui $$2 = this.a($$0);
         Optional<String> $$3 = $$2.i("fancyGraphics");
         if ($$3.isPresent() && !$$2.b("graphicsMode")) {
            this.aE.a(a($$3.get()) ? ftw.b : ftw.a);
         }

         this.a(
            new fui.a() {
               @Nullable
               private String a(String $$0) {
                  vi $$1 = $$2.a($$0);
                  if ($$1 == null) {
                     return null;
                  } else if ($$1 instanceof vg var3) {
                     vg var10000 = var3;

                     try {
                        var7 = var10000.k();
                     } catch (Throwable var6) {
                        throw new MatchException(var6.toString(), var6);
                     }

                     return var7;
                  } else {
                     throw new IllegalStateException("Cannot read field of wrong type, expected string: " + $$1);
                  }
               }

               @Override
               public <T> void a(String $$0, fuh<T> $$1) {
                  String $$2x = this.a($$0);
                  if ($$2x != null) {
                     JsonElement $$3x = bbw.a($$2x.isEmpty() ? "\"\"" : $$2x);
                     $$1.d()
                        .parse(JsonOps.INSTANCE, $$3x)
                        .ifError($$2xx -> fui.ag.error("Error parsing option value {} for option {}: {}", new Object[]{$$2, $$1, $$2xx.message()}))
                        .ifSuccess($$1::a);
                  }
               }

               @Override
               public int a(String $$0, int $$1) {
                  String $$2x = this.a($$0);
                  if ($$2x != null) {
                     try {
                        return Integer.parseInt($$2x);
                     } catch (NumberFormatException var5) {
                        fui.ag.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$2x, var5});
                     }
                  }

                  return $$1;
               }

               @Override
               public boolean a(String $$0, boolean $$1) {
                  String $$2x = this.a($$0);
                  return $$2x != null ? fui.a($$2x) : $$1;
               }

               @Override
               public String a(String $$0, String $$1) {
                  return (String)MoreObjects.firstNonNull(this.a($$0), $$1);
               }

               @Override
               public float a(String $$0, float $$1) {
                  String $$2x = this.a($$0);
                  if ($$2x == null) {
                     return $$1;
                  } else if (fui.a($$2x)) {
                     return 1.0F;
                  } else if (fui.b($$2x)) {
                     return 0.0F;
                  } else {
                     try {
                        return Float.parseFloat($$2x);
                     } catch (NumberFormatException var5) {
                        fui.ag.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$2x, var5});
                        return $$1;
                     }
                  }
               }

               @Override
               public <T> T a(String $$0, T $$1, Function<String, T> $$2x, Function<T, String> $$3x) {
                  String $$4 = this.a($$0);
                  return $$4 == null ? $$1 : $$2x.apply($$4);
               }
            }
         );
         $$2.i("fullscreenResolution").ifPresent($$0x -> this.k = $$0x);
         fuc.d();
      } catch (Exception var7) {
         ag.error("Failed to load options", var7);
      }
   }

   static boolean a(String $$0) {
      return "true".equals($$0);
   }

   static boolean b(String $$0) {
      return "false".equals($$0);
   }

   private ui a(ui $$0) {
      int $$1 = 0;

      try {
         $$1 = $$0.i("version").map(Integer::parseInt).orElse(0);
      } catch (RuntimeException var4) {
      }

      return bdr.f.a(this.X.av(), $$0, $$1);
   }

   public void aC() {
      try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bW), StandardCharsets.UTF_8))) {
         $$0.println("version:" + ac.b().a().b());
         this.a(new fui.a() {
            public void a(String $$0) {
               $$0.print($$0);
               $$0.print(':');
            }

            @Override
            public <T> void a(String $$0, fuh<T> $$1) {
               $$1.d().encodeStart(JsonOps.INSTANCE, $$1.c()).ifError($$1x -> fui.ag.error("Error saving option " + $$1 + ": " + $$1x)).ifSuccess($$2x -> {
                  this.a($$0);
                  $$0.println(fui.ah.toJson($$2x));
               });
            }

            @Override
            public int a(String $$0, int $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public boolean a(String $$0, boolean $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public String a(String $$0, String $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public float a(String $$0, float $$1) {
               this.a($$0);
               $$0.println($$1);
               return $$1;
            }

            @Override
            public <T> T a(String $$0, T $$1, Function<String, T> $$2x, Function<T, String> $$3) {
               this.a($$0);
               $$0.println($$3.apply($$1));
               return $$1;
            }
         });
         String $$1 = this.aN();
         if ($$1 != null) {
            $$0.println("fullscreenResolution:" + $$1);
         }
      } catch (Exception var6) {
         ag.error("Failed to save options", var6);
      }

      this.aE();
   }

   @Nullable
   private String aN() {
      fni $$0 = this.X.aP();
      if ($$0 == null) {
         return this.k;
      } else {
         return $$0.e().isPresent() ? $$0.e().get().g() : null;
      }
   }

   public atl aD() {
      int $$0 = 0;

      for (cuv $$1 : this.aX) {
         $$0 |= $$1.a();
      }

      return new atl(this.ac, this.ar.c(), this.aK.c(), this.bq.c(), $$0, this.aY.c(), this.X.aU(), this.bC.c(), this.cq.c());
   }

   public void aE() {
      if (this.X.t != null) {
         this.X.t.j.a(this.aD());
      }
   }

   public void a(cuv $$0, boolean $$1) {
      if ($$1) {
         this.aX.add($$0);
      } else {
         this.aX.remove($$0);
      }
   }

   public boolean a(cuv $$0) {
      return this.aX.contains($$0);
   }

   public ftq aF() {
      return this.az.c();
   }

   public boolean aG() {
      return this.q;
   }

   public void b(awz $$0) {
      Set<String> $$1 = Sets.newLinkedHashSet();
      Iterator<String> $$2 = this.i.iterator();

      while ($$2.hasNext()) {
         String $$3 = $$2.next();
         aww $$4 = $$0.c($$3);
         if ($$4 == null && !$$3.startsWith("file/")) {
            $$4 = $$0.c("file/" + $$3);
         }

         if ($$4 == null) {
            ag.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", $$3);
            $$2.remove();
         } else if (!$$4.d().a() && !this.j.contains($$3)) {
            ag.warn("Removed resource pack {} from options because it is no longer compatible", $$3);
            $$2.remove();
         } else if ($$4.d().a() && this.j.contains($$3)) {
            ag.info("Removed resource pack {} from incompatibility list because it's now compatible", $$3);
            this.j.remove($$3);
         } else {
            $$1.add($$4.g());
         }
      }

      $$0.b($$1);
   }

   public ftn aH() {
      return this.bX;
   }

   public void a(ftn $$0) {
      this.bX = $$0;
   }

   private static List<String> c(String $$0) {
      List<String> $$1 = bbq.a(ah, $$0, ai);
      return (List<String>)($$1 != null ? $$1 : Lists.newArrayList());
   }

   public File aI() {
      return this.bW;
   }

   public String aJ() {
      final List<Pair<String, Object>> $$0 = new ArrayList<>();
      this.a(new fui.b() {
         @Override
         public <T> void a(String $$0x, fuh<T> $$1) {
            $$0.add(Pair.of($$0, $$1.c()));
         }
      });
      $$0.add(Pair.of("fullscreenResolution", String.valueOf(this.k)));
      $$0.add(Pair.of("glDebugVerbosity", this.t));
      $$0.add(Pair.of("overrideHeight", this.p));
      $$0.add(Pair.of("overrideWidth", this.o));
      $$0.add(Pair.of("syncChunkWrites", this.ae));
      $$0.add(Pair.of("useNativeTransport", this.q));
      $$0.add(Pair.of("resourcePacks", this.i));
      return $$0.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map($$0x -> (String)$$0x.getFirst() + ": " + $$0x.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public void b(int $$0) {
      this.at = $$0;
   }

   public int aK() {
      return this.at > 0 ? Math.min(this.ar.c(), this.at) : this.ar.c();
   }

   private static xo c(xo $$0, int $$1) {
      return xo.a("options.pixel_value", $$0, $$1);
   }

   private static xo a(xo $$0, double $$1) {
      return xo.a("options.percent_value", $$0, (int)($$1 * 100.0));
   }

   public static xo a(xo $$0, xo $$1) {
      return xo.a("options.generic_value", $$0, $$1);
   }

   public static xo a(xo $$0, int $$1) {
      return a($$0, xo.b(Integer.toString($$1)));
   }

   public static xo b(xo $$0, int $$1) {
      return $$1 == 0 ? a($$0, xn.c) : a($$0, $$1);
   }

   private static xo b(xo $$0, double $$1) {
      return $$1 == 0.0 ? a($$0, xn.c) : a($$0, $$1);
   }

   interface a extends fui.b {
      int a(String var1, int var2);

      boolean a(String var1, boolean var2);

      String a(String var1, String var2);

      float a(String var1, float var2);

      <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
   }

   interface b {
      <T> void a(String var1, fuh<T> var2);
   }
}
