import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

public class buk {
   private Instant a = Instant.EPOCH;
   private Instant b = Instant.EPOCH;
   private final List<bup> c = Lists.newArrayList();
   private final List<buw> d = Lists.newArrayList();
   private final List<bur> e = Lists.newArrayList();
   private final Map<buv, buk.a> f = Maps.newHashMap();
   private final Map<buv, buk.a> g = Maps.newHashMap();
   private final Map<buq, buk.a> h = Maps.newHashMap();
   private final Map<buq, buk.a> i = Maps.newHashMap();
   private final List<bus> j = Lists.newArrayList();
   private final List<bus> k = Lists.newArrayList();
   private int l;
   private Duration m = Duration.ZERO;
   private final List<but> n = Lists.newArrayList();
   private final List<bux> o = Lists.newArrayList();
   private final List<buy> p = Lists.newArrayList();
   @Nullable
   private Duration q = null;

   private buk(Stream<RecordedEvent> $$0) {
      this.a($$0);
   }

   public static bul a(Path $$0) {
      try {
         bul var4;
         try (final RecordingFile $$1 = new RecordingFile($$0)) {
            Iterator<RecordedEvent> $$2 = new Iterator<RecordedEvent>() {
               @Override
               public boolean hasNext() {
                  return $$1.hasMoreEvents();
               }

               public RecordedEvent a() {
                  if (!this.hasNext()) {
                     throw new NoSuchElementException();
                  } else {
                     try {
                        return $$1.readEvent();
                     } catch (IOException var2) {
                        throw new UncheckedIOException(var2);
                     }
                  }
               }
            };
            Stream<RecordedEvent> $$3 = StreamSupport.stream(Spliterators.spliteratorUnknownSize($$2, 1297), false);
            var4 = new buk($$3).a();
         }

         return var4;
      } catch (IOException var7) {
         throw new UncheckedIOException(var7);
      }
   }

   private bul a() {
      Duration $$0 = Duration.between(this.a, this.b);
      return new bul(
         this.a,
         this.b,
         $$0,
         this.q,
         this.p,
         this.e,
         but.a($$0, this.n, this.m, this.l),
         bux.a(this.o),
         a($$0, this.f),
         a($$0, this.g),
         a($$0, this.i),
         a($$0, this.h),
         bus.a($$0, this.j),
         bus.a($$0, this.k),
         this.c,
         this.d
      );
   }

   private void a(Stream<RecordedEvent> $$0) {
      $$0.forEach($$0x -> {
         if ($$0x.getEndTime().isAfter(this.b) || this.b.equals(Instant.EPOCH)) {
            this.b = $$0x.getEndTime();
         }

         if ($$0x.getStartTime().isBefore(this.a) || this.a.equals(Instant.EPOCH)) {
            this.a = $$0x.getStartTime();
         }

         String var2 = $$0x.getEventType().getName();
         switch (var2) {
            case "minecraft.ChunkGeneration":
               this.c.add(bup.a($$0x));
               break;
            case "minecraft.StructureGeneration":
               this.d.add(buw.a($$0x));
               break;
            case "minecraft.LoadWorld":
               this.q = $$0x.getDuration();
               break;
            case "minecraft.ServerTickTime":
               this.p.add(buy.a($$0x));
               break;
            case "minecraft.PacketReceived":
               this.a($$0x, $$0x.getInt("bytes"), this.f);
               break;
            case "minecraft.PacketSent":
               this.a($$0x, $$0x.getInt("bytes"), this.g);
               break;
            case "minecraft.ChunkRegionRead":
               this.b($$0x, $$0x.getInt("bytes"), this.h);
               break;
            case "minecraft.ChunkRegionWrite":
               this.b($$0x, $$0x.getInt("bytes"), this.i);
               break;
            case "jdk.ThreadAllocationStatistics":
               this.o.add(bux.a($$0x));
               break;
            case "jdk.GCHeapSummary":
               this.n.add(but.a($$0x));
               break;
            case "jdk.CPULoad":
               this.e.add(bur.a($$0x));
               break;
            case "jdk.FileWrite":
               this.a($$0x, this.j, "bytesWritten");
               break;
            case "jdk.FileRead":
               this.a($$0x, this.k, "bytesRead");
               break;
            case "jdk.GarbageCollection":
               this.l++;
               this.m = this.m.plus($$0x.getDuration());
         }
      });
   }

   private void a(RecordedEvent $$0, int $$1, Map<buv, buk.a> $$2) {
      $$2.computeIfAbsent(buv.a($$0), $$0x -> new buk.a()).a($$1);
   }

   private void b(RecordedEvent $$0, int $$1, Map<buq, buk.a> $$2) {
      $$2.computeIfAbsent(buq.a($$0), $$0x -> new buk.a()).a($$1);
   }

   private void a(RecordedEvent $$0, List<bus> $$1, String $$2) {
      $$1.add(new bus($$0.getDuration(), $$0.getString("path"), $$0.getLong($$2)));
   }

   private static <T> buu<T> a(Duration $$0, Map<T, buk.a> $$1) {
      List<Pair<T, buu.a>> $$2 = $$1.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), ((buk.a)$$0x.getValue()).a())).toList();
      return new buu<>($$0, $$2);
   }

   public static final class a {
      private long a;
      private long b;

      public void a(int $$0) {
         this.b += $$0;
         this.a++;
      }

      public buu.a a() {
         return new buu.a(this.a, this.b);
      }
   }
}
