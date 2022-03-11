import HeaderDesktop from './Header-desktop';
import HeaderMobile from './Header-mobile';

export default function Header(){
    // const {data, loading, error} = useQuery()
    // const data= 'nome';
    // const viewer = data?.viewer
    return (
      <header>
        <nav id="mobile">
          <HeaderMobile />
        </nav>
        <nav id="desktop">
          <HeaderDesktop viewer={undefined} />
        </nav>
        <style jsx>{`
          header {
            width: 100vw;
            display: flex;
            flex-direction: column;
            margin-bottom: 30px;
            background-color: #ffffff;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.05);
          }
          #mobile {
            display: none;
            z-index: 0;
          }
          @media (max-width: 1000px) {
            #mobile {
              display: flex;
              z-index: 1;
            }
            #desktop {
              display: none;
              z-index: 0;
            }
          }
        `}</style>
      </header>
    );
}