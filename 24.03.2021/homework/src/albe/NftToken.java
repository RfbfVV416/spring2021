package albe;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class NftToken implements Token{
    private FreeSoftArt freeSoftArt;
    private UUID uniqueId;

    public NftToken(FreeSoftArt freeSoftArt) {
        this.freeSoftArt = freeSoftArt;
        this.uniqueId = UUID.randomUUID();
    }

    public static NftToken of (FreeSoftArt freeSoftArt) throws KeyAlreadyExistsException{
        return NftTokenRegistry.putAndReturn(freeSoftArt, new NftToken(freeSoftArt));
    }
    private static class NftTokenRegistry{
        private static final Map<FreeSoftArt, NftToken> NFT_TOKENS_REGISTRY = new HashMap<>();

        private static NftToken putAndReturn(FreeSoftArt freeSoftArt, NftToken nftToken) throws KeyAlreadyExistsException{
            //NFT_TOKENS_REGISTRY.computeIfAbsent() не надо
            //если в мапе ключ уже есть новый не кладем и бросаем KeyAlreadyExists
            //иначе кладем и возвращаем то что положили
            if (NFT_TOKENS_REGISTRY.containsKey(freeSoftArt)) {
                throw new KeyAlreadyExistsException("Key already exists");
            } else {
                NFT_TOKENS_REGISTRY.put(freeSoftArt, nftToken);
            }
            return NFT_TOKENS_REGISTRY.get(freeSoftArt);
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NftToken nftToken = (NftToken) o;
        return Objects.equals(freeSoftArt, nftToken.freeSoftArt) &&
                Objects.equals(uniqueId, nftToken.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeSoftArt, uniqueId);
    }
}
