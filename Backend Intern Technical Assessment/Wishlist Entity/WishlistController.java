@RestController
@RequestMapping("/api/wishlists")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public ResponseEntity<List<Wishlist>> getUserWishlist(@RequestParam Long userId) {
        List<Wishlist> wishlist = wishlistService.getUserWishlist(userId);
        return ResponseEntity.ok(wishlist);
    }

    @PostMapping
    public ResponseEntity<Wishlist> addWishlistItem(@RequestParam Long userId, @RequestParam String itemName) {
        Wishlist wishlistItem = wishlistService.addWishlistItem(userId, itemName);
        return ResponseEntity.ok(wishlistItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWishlistItem(@PathVariable Long id) {
        wishlistService.deleteWishlistItem(id);
        return ResponseEntity.ok().build();
    }
}

