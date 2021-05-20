import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(
		intValue = -1768124815
	)
	static int field1576;
	@ObfuscatedName("o")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	VarcInt() {
		this.persist = false; // L: 12
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "1372759053"
	)
	void method2659(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 32
			if (var2 == 0) { // L: 33
				return; // L: 36
			}

			this.method2657(var1, var2); // L: 34
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "0"
	)
	void method2657(Buffer var1, int var2) {
		if (var2 == 2) { // L: 39
			this.persist = true; // L: 40
		}

	} // L: 43

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Lbc;II[I[II)V",
		garbageValue = "-2096948369"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var11 != var12) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)V",
		garbageValue = "685963148"
	)
	static final void method2656(Widget var0) {
		int var1 = var0.contentType; // L: 11272
		if (var1 == 324) { // L: 11273
			if (Client.field630 == -1) { // L: 11274
				Client.field630 = var0.spriteId2; // L: 11275
				Client.field631 = var0.spriteId; // L: 11276
			}

			if (Client.playerAppearance.isFemale) { // L: 11278
				var0.spriteId2 = Client.field630;
			} else {
				var0.spriteId2 = Client.field631; // L: 11279
			}

		} else if (var1 == 325) { // L: 11282
			if (Client.field630 == -1) { // L: 11283
				Client.field630 = var0.spriteId2; // L: 11284
				Client.field631 = var0.spriteId; // L: 11285
			}

			if (Client.playerAppearance.isFemale) { // L: 11287
				var0.spriteId2 = Client.field631;
			} else {
				var0.spriteId2 = Client.field630; // L: 11288
			}

		} else if (var1 == 327) { // L: 11291
			var0.modelAngleX = 150; // L: 11292
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11293
			var0.modelType = 5; // L: 11294
			var0.modelId = 0; // L: 11295
		} else if (var1 == 328) { // L: 11298
			var0.modelAngleX = 150; // L: 11299
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11300
			var0.modelType = 5; // L: 11301
			var0.modelId = 1; // L: 11302
		}
	} // L: 11280 11289 11296 11303 11305
}
