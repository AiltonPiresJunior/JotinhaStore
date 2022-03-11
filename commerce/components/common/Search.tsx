import { FaSearch } from "react-icons/fa";

export default function SearchBox() {
  return (
    <>
      <div className="search-box">
        <button className="search-button">
          <FaSearch color="#054293" size="15px" />
        </button>
        <input id="search" type="text" name="search" placeholder="Pesquisar" />
      </div>
      <style jsx>{`
        .search-box {
          display: flex;
          flex-direction: row;
          align-items: center;
          padding-right: 12px;
          height: 35px;
          background: #ffffff;
          border: 2px solid #f5f5f5;
          box-sizing: border-box;
          border-radius: 4px;
          font-family: quicksand;
          width: 45vh;
        }
        .search-box .search-button {
          display: flex;
          align-items: center;
          background: none;
          border: none;
          height: 100%;
          position: relative;
          left: 90%;
        }
        .search-box .search-button:focus {
          outline: none;
        }
        .search-box .search-button:hover {
          opacity: 40%;
        }
        .search-box input {
          width: 75%;
          height: 100%;
          border: none;
        }
        .search-box input:focus {
          outline: none;
        }
        .search-box select:focus {
          outline: none;
        }
      `}</style>
    </>
  );
}
