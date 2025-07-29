import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public interface zk {
   int a = 65536;
   zm<ByteBuf, Boolean> b = new zm<ByteBuf, Boolean>() {
      public Boolean a(ByteBuf $$0) {
         return $$0.readBoolean();
      }

      public void a(ByteBuf $$0, Boolean $$1) {
         $$0.writeBoolean($$1);
      }
   };
   zm<ByteBuf, Byte> c = new zm<ByteBuf, Byte>() {
      public Byte a(ByteBuf $$0) {
         return $$0.readByte();
      }

      public void a(ByteBuf $$0, Byte $$1) {
         $$0.writeByte($$1);
      }
   };
   zm<ByteBuf, Float> d = c.a(bcb::a, bcb::g);
   zm<ByteBuf, Short> e = new zm<ByteBuf, Short>() {
      public Short a(ByteBuf $$0) {
         return $$0.readShort();
      }

      public void a(ByteBuf $$0, Short $$1) {
         $$0.writeShort($$1);
      }
   };
   zm<ByteBuf, Integer> f = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readUnsignedShort();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeShort($$1);
      }
   };
   zm<ByteBuf, Integer> g = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return $$0.readInt();
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeInt($$1);
      }
   };
   zm<ByteBuf, Integer> h = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return xf.a($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         xf.a($$0, $$1);
      }
   };
   zm<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
   zm<ByteBuf, Long> j = new zm<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return $$0.readLong();
      }

      public void a(ByteBuf $$0, Long $$1) {
         $$0.writeLong($$1);
      }
   };
   zm<ByteBuf, Long> k = new zm<ByteBuf, Long>() {
      public Long a(ByteBuf $$0) {
         return xg.a($$0);
      }

      public void a(ByteBuf $$0, Long $$1) {
         xg.a($$0, $$1);
      }
   };
   zm<ByteBuf, Float> l = new zm<ByteBuf, Float>() {
      public Float a(ByteBuf $$0) {
         return $$0.readFloat();
      }

      public void a(ByteBuf $$0, Float $$1) {
         $$0.writeFloat($$1);
      }
   };
   zm<ByteBuf, Double> m = new zm<ByteBuf, Double>() {
      public Double a(ByteBuf $$0) {
         return $$0.readDouble();
      }

      public void a(ByteBuf $$0, Double $$1) {
         $$0.writeDouble($$1);
      }
   };
   zm<ByteBuf, byte[]> n = new zm<ByteBuf, byte[]>() {
      public byte[] a(ByteBuf $$0) {
         return wg.a($$0);
      }

      public void a(ByteBuf $$0, byte[] $$1) {
         wg.a($$0, $$1);
      }
   };
   zm<ByteBuf, long[]> o = new zm<ByteBuf, long[]>() {
      public long[] a(ByteBuf $$0) {
         return wg.b($$0);
      }

      public void a(ByteBuf $$0, long[] $$1) {
         wg.a($$0, $$1);
      }
   };
   zm<ByteBuf, String> p = b(32767);
   zm<ByteBuf, vi> q = b((Supplier<ur>)(() -> ur.a(2097152L)));
   zm<ByteBuf, vi> r = b(ur::a);
   zm<ByteBuf, ui> s = c((Supplier<ur>)(() -> ur.a(2097152L)));
   zm<ByteBuf, ui> t = c(ur::a);
   zm<ByteBuf, Optional<ui>> u = new zm<ByteBuf, Optional<ui>>() {
      public Optional<ui> a(ByteBuf $$0) {
         return Optional.ofNullable(wg.i($$0));
      }

      public void a(ByteBuf $$0, Optional<ui> $$1) {
         wg.a($$0, $$1.orElse(null));
      }
   };
   zm<ByteBuf, Vector3f> v = new zm<ByteBuf, Vector3f>() {
      public Vector3f a(ByteBuf $$0) {
         return wg.e($$0);
      }

      public void a(ByteBuf $$0, Vector3f $$1) {
         wg.a($$0, $$1);
      }
   };
   zm<ByteBuf, Quaternionf> w = new zm<ByteBuf, Quaternionf>() {
      public Quaternionf a(ByteBuf $$0) {
         return wg.f($$0);
      }

      public void a(ByteBuf $$0, Quaternionf $$1) {
         wg.a($$0, $$1);
      }
   };
   zm<ByteBuf, Integer> x = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return wg.j($$0);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         wg.b($$0, $$1);
      }
   };
   zm<ByteBuf, PropertyMap> y = new zm<ByteBuf, PropertyMap>() {
      private static final int a = 64;
      private static final int b = 32767;
      private static final int c = 1024;
      private static final int d = 16;

      public PropertyMap a(ByteBuf $$0) {
         int $$1 = zk.a($$0, 16);
         PropertyMap $$2 = new PropertyMap();

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            String $$4 = xe.a($$0, 64);
            String $$5 = xe.a($$0, 32767);
            String $$6 = wg.a($$0, (zn<? super ByteBuf, String>)($$0x -> xe.a($$0x, 1024)));
            Property $$7 = new Property($$4, $$5, $$6);
            $$2.put($$7.name(), $$7);
         }

         return $$2;
      }

      public void a(ByteBuf $$0, PropertyMap $$1) {
         zk.a($$0, $$1.size(), 16);

         for (Property $$2 : $$1.values()) {
            xe.a($$0, $$2.name(), 64);
            xe.a($$0, $$2.value(), 32767);
            wg.a($$0, $$2.signature(), ($$0x, $$1x) -> xe.a($$0x, $$1x, 1024));
         }
      }
   };
   zm<ByteBuf, GameProfile> z = new zm<ByteBuf, GameProfile>() {
      public GameProfile a(ByteBuf $$0) {
         UUID $$1 = kf.g.decode($$0);
         String $$2 = xe.a($$0, 16);
         GameProfile $$3 = new GameProfile($$1, $$2);
         $$3.getProperties().putAll((Multimap)zk.y.decode($$0));
         return $$3;
      }

      public void a(ByteBuf $$0, GameProfile $$1) {
         kf.g.encode($$0, $$1.getId());
         xe.a($$0, $$1.getName(), 16);
         zk.y.encode($$0, $$1.getProperties());
      }
   };
   zm<ByteBuf, Integer> A = new zm<ByteBuf, Integer>() {
      public Integer a(ByteBuf $$0) {
         return baj.a($$0.readByte() & 0xFF, $$0.readByte() & 0xFF, $$0.readByte() & 0xFF);
      }

      public void a(ByteBuf $$0, Integer $$1) {
         $$0.writeByte(baj.b($$1));
         $$0.writeByte(baj.c($$1));
         $$0.writeByte(baj.d($$1));
      }
   };

   static zm<ByteBuf, byte[]> a(final int $$0) {
      return new zm<ByteBuf, byte[]>() {
         public byte[] a(ByteBuf $$0x) {
            return wg.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, byte[] $$1) {
            if ($$1.length > $$0) {
               throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
            } else {
               wg.a($$0, $$1);
            }
         }
      };
   }

   static zm<ByteBuf, String> b(final int $$0) {
      return new zm<ByteBuf, String>() {
         public String a(ByteBuf $$0x) {
            return xe.a($$0, $$0);
         }

         public void a(ByteBuf $$0x, String $$1) {
            xe.a($$0, $$1, $$0);
         }
      };
   }

   static zm<ByteBuf, Optional<vi>> a(final Supplier<ur> $$0) {
      return new zm<ByteBuf, Optional<vi>>() {
         public Optional<vi> a(ByteBuf $$0x) {
            return Optional.ofNullable(wg.a($$0, $$0.get()));
         }

         public void a(ByteBuf $$0x, Optional<vi> $$1) {
            wg.a($$0, $$1.orElse(null));
         }
      };
   }

   static zm<ByteBuf, vi> b(final Supplier<ur> $$0) {
      return new zm<ByteBuf, vi>() {
         public vi a(ByteBuf $$0x) {
            vi $$1 = wg.a($$0, $$0.get());
            if ($$1 == null) {
               throw new DecoderException("Expected non-null compound tag");
            } else {
               return $$1;
            }
         }

         public void a(ByteBuf $$0x, vi $$1) {
            if ($$1 == uk.b) {
               throw new EncoderException("Expected non-null compound tag");
            } else {
               wg.a($$0, $$1);
            }
         }
      };
   }

   static zm<ByteBuf, ui> c(Supplier<ur> $$0) {
      return b($$0).a($$0x -> {
         if ($$0x instanceof ui $$1) {
            return $$1;
         } else {
            throw new DecoderException("Not a compound tag: " + $$0x);
         }
      }, $$0x -> $$0x);
   }

   static <T> zm<ByteBuf, T> a(Codec<T> $$0) {
      return a($$0, ur::a);
   }

   static <T> zm<ByteBuf, T> b(Codec<T> $$0) {
      return a($$0, () -> ur.a(2097152L));
   }

   static <T, B extends ByteBuf, V> zm.a<B, T, V> a(DynamicOps<T> $$0, Codec<V> $$1) {
      return $$2 -> new zm<B, V>() {
         public V a(B $$0x) {
            T $$1x = (T)$$2.decode($$0);
            return (V)$$1.parse($$0, $$1x).getOrThrow($$1xxx -> new DecoderException("Failed to decode: " + $$1xxx + " " + $$1));
         }

         public void a(B $$0x, V $$1x) {
            T $$2x = (T)$$1.encodeStart($$0, $$1).getOrThrow($$1xxx -> new EncoderException("Failed to encode: " + $$1xxx + " " + $$1));
            $$2.encode($$0, $$2x);
         }
      };
   }

   static <T> zm<ByteBuf, T> a(Codec<T> $$0, Supplier<ur> $$1) {
      return b($$1).a(a(uw.a, $$0));
   }

   static <T> zm<wx, T> c(Codec<T> $$0) {
      return b($$0, ur::a);
   }

   static <T> zm<wx, T> d(Codec<T> $$0) {
      return b($$0, () -> ur.a(2097152L));
   }

   static <T> zm<wx, T> b(final Codec<T> $$0, Supplier<ur> $$1) {
      final zm<ByteBuf, vi> $$2 = b($$1);
      return new zm<wx, T>() {
         public T a(wx $$0x) {
            vi $$1x = $$2.decode($$0);
            amc<vi> $$2x = $$0.H().a(uw.a);
            return (T)$$0.parse($$2x, $$1x).getOrThrow($$1xx -> new DecoderException("Failed to decode: " + $$1xx + " " + $$1));
         }

         public void a(wx $$0x, T $$1x) {
            amc<vi> $$2x = $$0.H().a(uw.a);
            vi $$3 = (vi)$$0.encodeStart($$2x, $$1x).getOrThrow($$1xx -> new EncoderException("Failed to encode: " + $$1xx + " " + $$1));
            $$2.encode($$0, $$3);
         }
      };
   }

   static <B extends ByteBuf, V> zm<B, Optional<V>> a(final zm<B, V> $$0) {
      return new zm<B, Optional<V>>() {
         public Optional<V> a(B $$0x) {
            return $$0.readBoolean() ? Optional.of($$0.decode($$0)) : Optional.empty();
         }

         public void a(B $$0x, Optional<V> $$1) {
            if ($$1.isPresent()) {
               $$0.writeBoolean(true);
               $$0.encode($$0, $$1.get());
            } else {
               $$0.writeBoolean(false);
            }
         }
      };
   }

   static int a(ByteBuf $$0, int $$1) {
      int $$2 = xf.a($$0);
      if ($$2 > $$1) {
         throw new DecoderException($$2 + " elements exceeded max size of: " + $$1);
      } else {
         return $$2;
      }
   }

   static void a(ByteBuf $$0, int $$1, int $$2) {
      if ($$1 > $$2) {
         throw new EncoderException($$1 + " elements exceeded max size of: " + $$2);
      } else {
         xf.a($$0, $$1);
      }
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm<B, C> a(IntFunction<C> $$0, zm<? super B, V> $$1) {
      return a($$0, $$1, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm<B, C> a(final IntFunction<C> $$0, final zm<? super B, V> $$1, final int $$2) {
      return new zm<B, C>() {
         public C a(B $$0x) {
            int $$1x = zk.a($$0, $$2);
            C $$2x = $$0.apply(Math.min($$1x, 65536));

            for (int $$3 = 0; $$3 < $$1x; $$3++) {
               $$2x.add($$1.decode($$0));
            }

            return $$2x;
         }

         public void a(B $$0x, C $$1x) {
            zk.a($$0, $$1.size(), $$2);

            for (V $$2x : $$1) {
               $$1.encode($$0, $$2x);
            }
         }
      };
   }

   static <B extends ByteBuf, V, C extends Collection<V>> zm.a<B, V, C> a(IntFunction<C> $$0) {
      return $$1 -> a($$0, $$1);
   }

   static <B extends ByteBuf, V> zm.a<B, V, List<V>> a() {
      return $$0 -> a(ArrayList::new, $$0);
   }

   static <B extends ByteBuf, V> zm.a<B, V, List<V>> c(int $$0) {
      return $$1 -> a(ArrayList::new, $$1, $$0);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zm<B, M> a(IntFunction<? extends M> $$0, zm<? super B, K> $$1, zm<? super B, V> $$2) {
      return a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   static <B extends ByteBuf, K, V, M extends Map<K, V>> zm<B, M> a(
      final IntFunction<? extends M> $$0, final zm<? super B, K> $$1, final zm<? super B, V> $$2, final int $$3
   ) {
      return new zm<B, M>() {
         public void a(B $$0x, M $$1x) {
            zk.a($$0, $$1.size(), $$3);
            $$1.forEach(($$3xx, $$4) -> {
               $$1.encode($$0, (K)$$3xx);
               $$2.encode($$0, (V)$$4);
            });
         }

         public M a(B $$0x) {
            int $$1x = zk.a($$0, $$3);
            M $$2x = (M)$$0.apply(Math.min($$1x, 65536));

            for (int $$3x = 0; $$3x < $$1x; $$3x++) {
               K $$4 = $$1.decode($$0);
               V $$5 = $$2.decode($$0);
               $$2x.put($$4, $$5);
            }

            return $$2x;
         }
      };
   }

   static <B extends ByteBuf, L, R> zm<B, Either<L, R>> a(final zm<? super B, L> $$0, final zm<? super B, R> $$1) {
      return new zm<B, Either<L, R>>() {
         public Either<L, R> a(B $$0x) {
            return $$0.readBoolean() ? Either.left($$0.decode($$0)) : Either.right($$1.decode($$0));
         }

         public void a(B $$0x, Either<L, R> $$1x) {
            $$1.ifLeft($$2 -> {
               $$0.writeBoolean(true);
               $$0.encode($$0, (L)$$2);
            }).ifRight($$2 -> {
               $$0.writeBoolean(false);
               $$1.encode($$0, (R)$$2);
            });
         }
      };
   }

   static <B extends ByteBuf, V> zm.a<B, V, V> a(int $$0, BiFunction<B, ByteBuf, B> $$1) {
      return $$2 -> new zm<B, V>() {
         public V a(B $$0x) {
            int $$1x = xf.a($$0);
            if ($$1x > $$0) {
               throw new DecoderException("Buffer size " + $$1x + " is larger than allowed limit of " + $$0);
            } else {
               int $$2x = $$0.readerIndex();
               B $$3 = (B)((ByteBuf)$$1.apply($$0, $$0.slice($$2x, $$1x)));
               $$0.readerIndex($$2x + $$1x);
               return (V)$$2.decode($$3);
            }
         }

         public void a(B $$0x, V $$1x) {
            B $$2x = (B)((ByteBuf)$$1.apply($$0, $$0.alloc().buffer()));

            try {
               $$2.encode($$2x, $$1);
               int $$3 = $$2x.readableBytes();
               if ($$3 > $$0) {
                  throw new EncoderException("Buffer size " + $$3 + " is  larger than allowed limit of " + $$0);
               }

               xf.a($$0, $$3);
               $$0.writeBytes($$2x);
            } finally {
               $$2x.release();
            }
         }
      };
   }

   static <V> zm.a<ByteBuf, V, V> d(int $$0) {
      return a($$0, ($$0x, $$1) -> $$1);
   }

   static <V> zm.a<wx, V, V> e(int $$0) {
      return a($$0, ($$0x, $$1) -> new wx($$1, $$0x.H()));
   }

   static <T> zm<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
      return new zm<ByteBuf, T>() {
         public T a(ByteBuf $$0x) {
            int $$1x = xf.a($$0);
            return $$0.apply($$1x);
         }

         public void a(ByteBuf $$0x, T $$1x) {
            int $$2 = $$1.applyAsInt($$1);
            xf.a($$0, $$2);
         }
      };
   }

   static <T> zm<ByteBuf, T> a(jq<T> $$0) {
      return a($$0::b, $$0::c);
   }

   private static <T, R> zm<wx, R> a(final amd<? extends jy<T>> $$0, final Function<jy<T>, jq<R>> $$1) {
      return new zm<wx, R>() {
         private jq<R> b(wx $$0x) {
            return $$1.apply($$0.H().f($$0));
         }

         public R a(wx $$0x) {
            int $$1x = xf.a($$0);
            return (R)this.b($$0).b($$1x);
         }

         public void a(wx $$0x, R $$1x) {
            int $$2 = this.b($$0).c($$1);
            xf.a($$0, $$2);
         }
      };
   }

   static <T> zm<wx, T> a(amd<? extends jy<T>> $$0) {
      return a($$0, $$0x -> $$0x);
   }

   static <T> zm<wx, jl<T>> b(amd<? extends jy<T>> $$0) {
      return a($$0, jy::t);
   }

   static <T> zm<wx, jl<T>> a(final amd<? extends jy<T>> $$0, final zm<? super wx, T> $$1) {
      return new zm<wx, jl<T>>() {
         private static final int c = 0;

         private jq<jl<T>> b(wx $$0x) {
            return $$0.H().f($$0).t();
         }

         public jl<T> a(wx $$0x) {
            int $$1x = xf.a($$0);
            return $$1x == 0 ? jl.a($$1.decode($$0)) : (jl)this.b($$0).b($$1x - 1);
         }

         public void a(wx $$0x, jl<T> $$1x) {
            switch ($$1.f()) {
               case a:
                  int $$2 = this.b($$0).c($$1);
                  xf.a($$0, $$2 + 1);
                  break;
               case b:
                  xf.a($$0, 0);
                  $$1.encode($$0, $$1.a());
            }
         }
      };
   }

   static <T> zm<wx, jp<T>> c(final amd<? extends jy<T>> $$0) {
      return new zm<wx, jp<T>>() {
         private static final int b = -1;
         private final zm<wx, jl<T>> c = zk.b($$0);

         public jp<T> a(wx $$0x) {
            int $$1 = xf.a($$0) - 1;
            if ($$1 == -1) {
               jy<T> $$2 = $$0.H().f($$0);
               return $$2.a(bae.a($$0, ame.b.decode($$0))).orElseThrow();
            } else {
               List<jl<T>> $$3 = new ArrayList<>(Math.min($$1, 65536));

               for (int $$4 = 0; $$4 < $$1; $$4++) {
                  $$3.add(this.c.decode($$0));
               }

               return jp.a($$3);
            }
         }

         public void a(wx $$0x, jp<T> $$1) {
            Optional<bae<T>> $$2 = $$1.e();
            if ($$2.isPresent()) {
               xf.a($$0, 0);
               ame.b.encode($$0, $$2.get().b());
            } else {
               xf.a($$0, $$1.b() + 1);

               for (jl<T> $$3 : $$1) {
                  this.c.encode($$0, $$3);
               }
            }
         }
      };
   }

   static zm<ByteBuf, JsonElement> f(final int $$0) {
      return new zm<ByteBuf, JsonElement>() {
         private static final Gson b = new GsonBuilder().disableHtmlEscaping().create();

         public JsonElement a(ByteBuf $$0x) {
            String $$1 = xe.a($$0, $$0);

            try {
               return bbw.a($$1);
            } catch (JsonSyntaxException var4) {
               throw new DecoderException("Failed to parse JSON", var4);
            }
         }

         public void a(ByteBuf $$0x, JsonElement $$1) {
            String $$2 = b.toJson($$1);
            xe.a($$0, $$2, $$0);
         }
      };
   }
}
