import Link from 'next/link';
import {
  FaShoppingCart,
  FaRegHeart,
  FaCircle,
  FaUserCircle,
  FaUser,
  FaSignOutAlt,
  FaBars,
} from 'react-icons/fa';
import Logo from '../logo';
import Search from '../Search';

export default function HeaderDesktop({ viewer }){
    
    return (
      <>
        <div className="header header-top">
          <Logo />
          <Search />

          <div className="nav-buttons">
            {!viewer && (
              <Link href="/user/login">
                <a className="nav-buttons-signin">
                  <FaUserCircle color="#fffff" size={30} />
                  <p>Entrar</p>
                </a>
              </Link>
            )}
            {viewer && (
              <>
                <Link href="/profile">
                  <a className="nav-buttons-profile">
                    <FaUserCircle color="#fffff" size={30} />
                    <p>{viewer.name}</p>
                  </a>
                </Link>
                <Link href="/user/signout">
                  <a className="nav-buttons-signout">
                    <FaSignOutAlt />
                  </a>
                </Link>
              </>
            )}
            <Link href="/cart">
              <a className="nav-buttons-items">
                <FaShoppingCart color="#fffff" size={30} />
                <p>Itens</p>
              </a>
            </Link>
          </div>
        </div>
        <div className="header header-bottom">
          <div className="all-categories-box">
            <FaBars color="#fafafa" />
            <select name="categories" id="categories">
              <option value="All Categories" selected>
                Categorias
              </option>
              <option value="#">Futebol Nacional</option>
              <option value="#">Futebol Internacional</option>
              <option value="#">Basquete</option>
              <option value="#">Corta-Vento</option>
            </select>
          </div>

          <nav className="main-nav">
            <Link href="#">
              <a>Promoções</a>
            </Link>
            <Link href="#">
              <a>Contato</a>
            </Link>
            <Link href="#">
              <a>Brasileirão</a>
            </Link>
            <Link href="#">
              <a>Basquete</a>
            </Link>
            <Link href="#">
              <a>Corta-Vento</a>
            </Link>
          </nav>

          <div className="settings">
            <div className="menu-dropdown">
              <p>Jotinha Store</p>
            </div>
          </div>
        </div>
        <style jsx>{`
          /* Header Top */
          .header {
            display: flex;
            flex-direction: row;
            justify-content: space-between;
            align-items: center;
            padding: 1px 4vw;
            background-color: #054293;
            height: 15vh;
            max-width: 100%;
          }
          .nav-buttons {
            display: flex;
            flex-direction: row;
            align-items: center;
          }
          .nav-buttons a {
            display: flex;
            flex-direction: row;
            align-items: center;
            margin-left: 32px;
            font-style: normal;
            font-weight: 500;
            font-size: 14px;
            font-family: quicksand;
            text-decoration: none;
            color: #ffffff;
            max-width: 100%;
          }
          .nav-buttons .items-total {
            font-size: 12px;
            align-self: flex-end;
          }
          .nav-buttons .nav-buttons-signout {
            margin-left: 12px;
          }
          .nav-buttons a:hover {
            text-decoration: underline;
          }
          .nav-buttons a p {
            margin-left: 8px;
          }
          /* Header Bottom */
          .header-bottom {
            padding: 0px 6vw;
            border-top: 2px solid #f5f5f5;
            background-color: #fafafa;
            height: 7vh;
            max-width: 100%;
          }
          .circulo {
            width: 30px;
            height: 30px;
            background-color: #fffff;
            margin: 50px;
            border-radius: 50%;
          }
          .header-bottom .all-categories-box {
            height: 31%;
            display: flex;
            align-items: center;
            /* Border */
            border-right: 2px solid #f5f5f5;
            padding-top: 20px;
            padding-bottom: 20px;
            padding-right: 48px;
          }
          .header-bottom .all-categories-box select {
            height: 20vh;
            padding-left: 15px;
            font-family: quicksand;
            font-style: normal;
            font-weight: 900;
            font-size: 16px;
            line-height: 60px;
            color: #333333;
            border: none;
            background: none;
          }
          .header-bottom .all-categories-box select:focus {
            outline: none;
          }
          .header-bottom .main-nav {
            display: flex;
            align-items: center;
          }
          .header-bottom .main-nav a {
            font-family: quicksand;
            font-style: normal;
            font-weight: 900;
            font-size: 14px;
            color: #333333;
            text-decoration: none;
            margin-left: 16px;
            margin-right: 16px;
          }
          .header-bottom .main-nav a:hover {
            text-decoration: underline;
          }
          .header-bottom .settings {
            display: flex;
            flex-direction: row;
            align-items: center;
          }
          .header-bottom .settings .menu-dropdown {
            /* Border */
            border-left: 2px solid #f5f5f5;
            padding: 20px 24px;
          }
          .header-bottom .settings .menu-dropdown p {
            font-family: quicksand;
            font-style: normal;
            font-weight: 600;
            font-size: 14px;
            color: #333333;
          }
          @media (max-width: 1000px) {
          #header {
            display: flex;
            z-index: 1;
          }
          #desktop {
            display: none;
            z-index: 0;
          }
        `}</style>
      </>
    );
}